package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QPointsType;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class PointsTypeExpressions {

	 public static final QPointsType TABLE = QPointsType.pointsType;

	 public static BooleanExpression hasIdTipoPuntiEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPointsType.pointsType.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPointsType.pointsType.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomePuntiEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.eq(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.eq(param) : null;
	 }

	 public static BooleanExpression containsNomePunti(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.contains(param) : null;
	 }

	 public static BooleanExpression containsNomePunti(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.contains(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.in(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.in(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.like(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.like(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomePuntiNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPointsType.pointsType.nomePunti.notLike(param) : null;
	 }

}