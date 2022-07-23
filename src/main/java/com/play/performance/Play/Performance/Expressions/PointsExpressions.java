package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QPoints;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class PointsExpressions {

	 public static final QPoints TABLE = QPoints.points;

	 public static BooleanExpression hasIdEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdUtenteEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasPuntiEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.eq(param) : null;
	 }

	 public static BooleanExpression hasPuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.eq(param) : null;
	 }

	 public static BooleanExpression hasPuntiNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.ne(param) : null;
	 }

	 public static BooleanExpression hasPuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.ne(param) : null;
	 }

	 public static BooleanExpression hasPuntiIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.in(param) : null;
	 }

	 public static BooleanExpression hasPuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.in(param) : null;
	 }

	 public static BooleanExpression hasPuntiNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.notIn(param) : null;
	 }

	 public static BooleanExpression hasPuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.notIn(param) : null;
	 }

	 public static BooleanExpression hasPuntiLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.loe(param) : null;
	 }

	 public static BooleanExpression hasPuntiLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.loe(param) : null;
	 }

	 public static BooleanExpression hasPuntiLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.lt(param) : null;
	 }

	 public static BooleanExpression hasPuntiLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.lt(param) : null;
	 }

	 public static BooleanExpression hasPuntiGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.goe(param) : null;
	 }

	 public static BooleanExpression hasPuntiGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.goe(param) : null;
	 }

	 public static BooleanExpression hasPuntiGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.gt(param) : null;
	 }

	 public static BooleanExpression hasPuntiGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.punti.gt(param) : null;
	 }

	 public static BooleanExpression hasPuntiBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.punti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasPuntiBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.punti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.eq(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.eq(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.ne(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.ne(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.after(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.after(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.before(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.dataAssegnazione.before(param) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.dataAssegnazione.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataAssegnazioneBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.dataAssegnazione.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.eq(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.eq(param) : null;
	 }

	 public static BooleanExpression containsClasseOriginePunti(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.contains(param) : null;
	 }

	 public static BooleanExpression containsClasseOriginePunti(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.contains(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.in(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.in(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.like(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.like(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.notLike(param) : null;
	 }

	 public static BooleanExpression hasClasseOriginePuntiNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.classeOriginePunti.notLike(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QPoints.points.idOriginePunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idOriginePunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdOriginePuntiBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QPoints.points.idOriginePunti.between(param1, param2) : null;
	 }

}