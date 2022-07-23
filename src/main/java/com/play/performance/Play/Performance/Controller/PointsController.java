package com.play.performance.Play.Performance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.play.performance.Play.Performance.DataObjects.Points;
import com.play.performance.Play.Performance.Repository.PointsRepository;

import static com.play.performance.Play.Performance.Expressions.PointsExpressions.*;

@RestController
public class PointsController {
	private PointsRepository pointsRepository;
	private DomainPointsTypeController domainPointsTypeController;

	@Autowired
	public PointsController(PointsRepository pointsRepository, DomainPointsTypeController domainPointsTypeController){
		super();
		this.pointsRepository = pointsRepository;
		this.domainPointsTypeController = domainPointsTypeController;
	}
	
	@GetMapping(path = "/user-points")
	public @ResponseBody Iterable<Points> getAllUserPoints(@RequestParam(value = "idUtente") long userId,
			@RequestParam(value = "idDominio") long domainId){
		return pointsRepository.findAll(hasIdUtenteEq(userId).and(hasIdDominioEq(domainId)));
	}
	
	@GetMapping(path = "/user-points-type")
	public @ResponseBody Iterable<Points> getAllUserPointsByPointsType(@RequestParam(value = "idUtente") long userId,
			@RequestParam(value = "idDominio") long domainId,
			@RequestParam(value = "idTipoPunti") long pointsTypeId){
		return pointsRepository.findAll(hasIdUtenteEq(userId).and(hasIdDominioEq(domainId)).and(hasIdTipoPuntiEq(pointsTypeId)));
	}
	
	@PostMapping("/register-points")
	public @ResponseBody boolean registerPoints(@RequestBody String body) {
		try {
			Points points = new ObjectMapper().readValue(body, Points.class);
			boolean isEnabled = domainPointsTypeController.isPointsTypeEnabledForDomainId(points.getIdTipoPunti(), points.getIdDominio());
			if(isEnabled) {
				pointsRepository.save(points);
			}
		}catch (JsonProcessingException e) {
			return false;
		}
		return true;
	}

}
