package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QRuleEntity;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class RuleEntityExpressions {

	 public static final QRuleEntity TABLE = QRuleEntity.ruleEntity;

	 public static BooleanExpression hasIdEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdRegolaEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.eq(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.eq(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.ne(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.ne(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.in(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.in(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.loe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.loe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.lt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.lt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.goe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.goe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.gt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idRegola.gt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.idRegola.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdRegolaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.idRegola.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdEntitaEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.ne(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.ne(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.in(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.in(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.loe(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.loe(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.lt(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.lt(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.goe(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.goe(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.gt(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRuleEntity.ruleEntity.idEntita.gt(param) : null;
	 }

	 public static BooleanExpression hasIdEntitaBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.idEntita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdEntitaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRuleEntity.ruleEntity.idEntita.between(param1, param2) : null;
	 }

}