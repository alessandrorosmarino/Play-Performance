package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.Mission;
import com.play.performance.Play.Performance.Repository.MissionRepository;

@RestController
public class MissionController {
	private MissionRepository missionRepository;

	@Autowired
	public MissionController(MissionRepository missionRepository){
		super();
		this.missionRepository = missionRepository;
	}

	@GetMapping(path = "/all-missions")
	public @ResponseBody Iterable<Mission> getAllMissions(){
		return missionRepository.findAll();
	}
}
