package com.play.performance.Play.Performance.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.DomainPointsType;
import com.play.performance.Play.Performance.DataObjects.PointsType;
import com.play.performance.Play.Performance.Repository.PointsTypeRepository;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;

@RestController
public class PointsTypeController {
	private PointsTypeRepository pointsTypeRepository;
	private DomainPointsTypeController domainPointsTypeController;

	@Autowired
	public PointsTypeController(PointsTypeRepository pointsTypeRepository, DomainPointsTypeController domainPointsTypeController){
		super();
		this.pointsTypeRepository = pointsTypeRepository;
		this.domainPointsTypeController = domainPointsTypeController;
	}
	
	@GetMapping(path = "/points-types")
	public @ResponseBody Iterable<PointsType> getAllPointsTypes(){
		return pointsTypeRepository.findAll();
	}

	@GetMapping(path = "/points-type")
	public @ResponseBody PointsType getPointsType(@RequestParam(value = "idTipoPunti") long pointsTypeId){
		return PlayPerformanceUtils.processOptionalEntity(pointsTypeRepository.findById(pointsTypeId));
	}

	@GetMapping(path = "/all-points-types-by-domain-id")
	public @ResponseBody Iterable<PointsType> getAllPointsTypesByDomainId(@RequestParam(value = "idDominio") long domainId){
		Iterable<DomainPointsType> domainPointsTypeList = domainPointsTypeController.getAllDomainPointsTypes(domainId);
		return findAllPointsTypesByDomainPointsTypeList(domainPointsTypeList);
	}
	
	public Iterable<PointsType> findAllPointsTypesByDomainPointsTypeList(Iterable<DomainPointsType> list) {
		ArrayList<PointsType> pointsTypeList = new ArrayList<>();
		for(DomainPointsType domainPointsType : list) {
			PointsType pointsType = PlayPerformanceUtils.processOptionalEntity(pointsTypeRepository.findById(domainPointsType.getIdTipoPunti()));
			pointsTypeList.add(pointsType);
		}
		return pointsTypeList;
	}
}
