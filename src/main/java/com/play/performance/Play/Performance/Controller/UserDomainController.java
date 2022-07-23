package com.play.performance.Play.Performance.Controller;

import com.play.performance.Play.Performance.Expressions.UserDomainExpressions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.Domain;
import com.play.performance.Play.Performance.DataObjects.User;
import com.play.performance.Play.Performance.DataObjects.UserDomain;
import com.play.performance.Play.Performance.Repository.UserDomainRepository;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;

@RestController
public class UserDomainController {
	private UserDomainRepository userDomainRepository;
	private DomainController domainController;
	private UserController userController;

	@Autowired
	public UserDomainController(UserDomainRepository userDomainRepository, DomainController domainController){
		super();
		this.userDomainRepository = userDomainRepository;
		this.domainController = domainController;
		this.userController = userController;
	}
	
	@GetMapping(path = "/user-domain-name")
	public @ResponseBody UserDomain getUserDomainByName(@RequestParam(value = "idUtente") long userId,
			@RequestParam(value = "nomeDominio") String domainName){
		Domain domain = domainController.getDomainByName(domainName);
		return PlayPerformanceUtils.processOptionalEntity(userDomainRepository.findOne(
				UserDomainExpressions.hasIdUtenteEq(userId).and(UserDomainExpressions.hasIdDominioEq(domain.getIdDominio()))
		));
	}
	
	@GetMapping(path = "/user-domain-id")
	public @ResponseBody UserDomain getUserDomainById(@RequestParam(value = "idUtente") long userId,
			@RequestParam(value = "idDominio") long domainId){
		return PlayPerformanceUtils.processOptionalEntity(userDomainRepository.findOne(
				UserDomainExpressions.hasIdUtenteEq(userId).and(UserDomainExpressions.hasIdDominioEq(domainId))
		));
	}
	
	@GetMapping(path = "/user-domain-username")
	public @ResponseBody UserDomain getUserDomainByUsername(@RequestParam(value = "username") String username,
			@RequestParam(value = "idDominio") long domainId){
		return PlayPerformanceUtils.processOptionalEntity(userDomainRepository.findOne(
				UserDomainExpressions.hasUsernameEq(username).and(UserDomainExpressions.hasIdDominioEq(domainId))
		));
	}
	
	@GetMapping(path = "/user-domain-by-domain-id")
	public @ResponseBody Iterable<User> getAllUserDomainByDomainId(@RequestParam(value = "idDominio") long domainId){
		Iterable<UserDomain> userDomainList = userDomainRepository.findAll(
				UserDomainExpressions.hasIdDominioEq(domainId)
		);
		return userController.findAllUsersByUserDomainList(userDomainList);
	}
}
