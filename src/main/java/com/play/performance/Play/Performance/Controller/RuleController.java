package com.play.performance.Play.Performance.Controller;

import com.play.performance.Play.Performance.DataObjects.Leaderboard;
import com.play.performance.Play.Performance.DataObjects.User;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.FieldValue;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleData;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleLogicOperator;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleTarget;
import com.play.performance.Play.Performance.RuleLogic.RuleManager.RuleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.play.performance.Play.Performance.DataObjects.Rule;
import com.play.performance.Play.Performance.Repository.RuleRepository;

import java.util.List;

@RestController
public class RuleController {
	private RuleRepository ruleRepository;

	@Autowired
	public RuleController(RuleRepository ruleRepository){
		super();
		this.ruleRepository = ruleRepository;
	}
	
	@GetMapping(path = "/all-rules")
	public @ResponseBody Iterable<Rule> getAllRules(){
		return ruleRepository.findAll();
	}
	
	@PostMapping("/add-rule")
	public @ResponseBody boolean addRule(@RequestBody String body) {
		try {
			Rule rule = new ObjectMapper().readValue(body, Rule.class);
			rule = ruleRepository.save(rule);
		} catch (JsonProcessingException e) {
			return false;
		}
		return true;
	}

	@GetMapping(path = "/test")
	public @ResponseBody Iterable<Object> test(){
		RuleManager ruleManager = new RuleManager();
		FieldValue fieldValue = new FieldValue();
		fieldValue.setFieldName("nome");
		fieldValue.setFieldValue("A");
		fieldValue.setOperator(RuleLogicOperator.CONTAINS);
		RuleTarget ruleTarget = new RuleTarget();
		ruleTarget.setTargetClassName(User.class.getName());
		ruleTarget.setFieldValueList(List.of(fieldValue));
		ruleTarget.setTargetIdList(List.of(1L));
		RuleData ruleData = new RuleData();
		ruleData.setRuleTargetList(List.of(ruleTarget));
		return ruleManager.processRuleData(ruleData);
	}
}
