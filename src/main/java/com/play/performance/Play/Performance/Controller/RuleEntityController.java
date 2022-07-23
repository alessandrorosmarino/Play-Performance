package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.RuleEntity;
import com.play.performance.Play.Performance.Repository.RuleEntityRepository;

@RestController
public class RuleEntityController {
	private RuleEntityRepository ruleEntityRepository;

	@Autowired
	public RuleEntityController(RuleEntityRepository ruleEntityRepository){
		super();
		this.ruleEntityRepository = ruleEntityRepository;
	}
	
	@GetMapping(path = "/all-ruleEntitys")
	public @ResponseBody Iterable<RuleEntity> getAllRuleEntitys(){
		return ruleEntityRepository.findAll();
	}
}
