package com.play.performance.Play.Performance.Controller;

import com.play.performance.Play.Performance.Expressions.DomainExpressions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.Domain;
import com.play.performance.Play.Performance.Repository.DomainRepository;

@RestController
public class DomainController {
	private DomainRepository domainRepository;

	@Autowired
	public DomainController(DomainRepository domainRepository){
		super();
		this.domainRepository = domainRepository;
	}
	
	@GetMapping(path = "/domains")
	public @ResponseBody Iterable<Domain> getDomains(){
		return domainRepository.findAll();
	}
	
	@GetMapping(path = "/domain")
	public @ResponseBody Domain getDomainById(@RequestParam(value = "idDominio") long domainId) {
		return domainRepository.findById(domainId).get();
	}
	
	@GetMapping(path = "/domain-name")
	public @ResponseBody Domain getDomainByName(@RequestParam(value = "nomeDominio") String domainName) {
		return domainRepository.findOne(DomainExpressions.hasNomeDominioEq(domainName)).get();
	}

}
