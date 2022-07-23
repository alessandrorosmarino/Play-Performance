package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.Service.PlayPerformanceUserDetailsService;

@RestController

public class PlayPerformanceLoginController {
	private PlayPerformanceUserDetailsService playPerformanceUserDetailsService;

	@Autowired
	public PlayPerformanceLoginController(PlayPerformanceUserDetailsService playPerformanceUserDetailsService){
		super();
		this.playPerformanceUserDetailsService = playPerformanceUserDetailsService;
	}
	
	@GetMapping(path = "/login")
	public @ResponseBody UserDetails login(@RequestParam(value = "username") String username,
			@RequestParam(value = "idDominio") String domainId) {
		return playPerformanceUserDetailsService.loadUserByUsername(username);
	}
	
}
