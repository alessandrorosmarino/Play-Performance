package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.Badge;
import com.play.performance.Play.Performance.Repository.BadgeRepository;

@RestController
public class BadgeController {
	private BadgeRepository badgeRepository;

	@Autowired
	public BadgeController(BadgeRepository badgeRepository){
		super();
		this.badgeRepository = badgeRepository;
	}
	
	@GetMapping(path = "/badges")
	public @ResponseBody Iterable<Badge> getAllBadges(){
		return badgeRepository.findAll();
	}
}
