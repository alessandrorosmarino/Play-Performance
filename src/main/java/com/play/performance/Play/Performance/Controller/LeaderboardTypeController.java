package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.LeaderboardType;
import com.play.performance.Play.Performance.Repository.LeaderboardTypeRepository;

@RestController
public class LeaderboardTypeController {
	private LeaderboardTypeRepository leaderboardTypeRepository;

	@Autowired
	public LeaderboardTypeController(LeaderboardTypeRepository leaderboardTypeRepository){
		super();
		this.leaderboardTypeRepository = leaderboardTypeRepository;
	}
	
	@GetMapping(path = "/leaderboard-types")
	public @ResponseBody Iterable<LeaderboardType> getAllLeaderboardTypes(){
		return leaderboardTypeRepository.findAll();
	}
}
