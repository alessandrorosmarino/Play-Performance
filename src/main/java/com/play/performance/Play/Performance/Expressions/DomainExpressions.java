package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QDomain;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class DomainExpressions {

	 public static final QDomain TABLE = QDomain.domain;

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomain.domain.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomain.domain.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeDominioEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.eq(param) : null;
	 }

	 public static BooleanExpression containsNomeDominio(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.contains(param) : null;
	 }

	 public static BooleanExpression containsNomeDominio(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.in(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.in(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.like(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.like(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeDominioNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomain.domain.nomeDominio.notLike(param) : null;
	 }

}