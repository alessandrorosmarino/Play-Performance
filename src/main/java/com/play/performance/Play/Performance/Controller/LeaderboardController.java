package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.Leaderboard;
import com.play.performance.Play.Performance.Repository.LeaderboardRepository;

@RestController
public class LeaderboardController {
	private LeaderboardRepository leaderboardRepository;

	@Autowired
	public LeaderboardController(LeaderboardRepository leaderboardRepository){
		super();
		this.leaderboardRepository = leaderboardRepository;
	}
	
	@GetMapping(path = "/leaderboards")
	public @ResponseBody Iterable<Leaderboard> getAllLeaderboards(){
		return leaderboardRepository.findAll();
	}
	
	
}
