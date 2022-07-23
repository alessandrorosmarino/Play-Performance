package com.play.performance.Play.Performance.Controller;

import com.play.performance.Play.Performance.Expressions.DomainPointsTypeExpressions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.performance.Play.Performance.DataObjects.DomainPointsType;
import com.play.performance.Play.Performance.Repository.DomainPointsTypeRepository;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;

@RestController
public class DomainPointsTypeController {
	@Autowired
	private DomainPointsTypeRepository domainPointsTypeRepository;
	
	@GetMapping(path = "/domain-points-types")
	public @ResponseBody Iterable<DomainPointsType> getAllDomainPointsTypes(@RequestParam(value = "idDominio") long domainId){
		return domainPointsTypeRepository.findAll(DomainPointsTypeExpressions.hasIdDominioEq(domainId));
	}
	
	@GetMapping(path = "/domain-points-type")
	public @ResponseBody DomainPointsType getDomainPointsType(@RequestParam(value = "idDominio") long domainId,
			@RequestParam(value = "idTipoPunti") long pointTypesId){
		return PlayPerformanceUtils.processOptionalEntity(
				domainPointsTypeRepository.findOne(
						DomainPointsTypeExpressions.hasIdDominioEq(domainId).and(
								DomainPointsTypeExpressions.hasIdTipoPuntiEq(pointTypesId)
						)));
	}
	
	public boolean isPointsTypeEnabledForDomainId(long pointsTypeId, long domainId) {
		DomainPointsType domainPointsType = getDomainPointsType(domainId, pointsTypeId);
		return PlayPerformanceUtils.isNotEmpty(domainPointsType);
	}
}
