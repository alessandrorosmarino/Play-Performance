package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QBadge;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class BadgeExpressions {

	 public static final QBadge TABLE = QBadge.badge;

	 public static BooleanExpression hasIdBadgeEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.eq(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.eq(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.ne(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.ne(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.in(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.in(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.loe(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.loe(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.lt(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.lt(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.goe(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.goe(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idBadge.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBadgeBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.idBadge.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdBadgeBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.idBadge.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.eq(param) : null;
	 }

	 public static BooleanExpression containsNome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.contains(param) : null;
	 }

	 public static BooleanExpression containsNome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.in(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.in(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.notIn(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.notIn(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.loe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.loe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.lt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.lt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.goe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.goe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.gt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.valorePunteggio.gt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.valorePunteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasValorePunteggioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.valorePunteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasCumulabileEq(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.cumulabile.eq(param) : null;
	 }

	 public static BooleanExpression hasCumulabileEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.cumulabile.eq(param) : null;
	 }

	 public static BooleanExpression hasCumulabileNe(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.cumulabile.ne(param) : null;
	 }

	 public static BooleanExpression hasCumulabileNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.cumulabile.ne(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.after(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.after(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.before(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.inizioValidita.before(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.inizioValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.inizioValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasFineValiditaEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.after(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.after(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.before(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QBadge.badge.fineValidita.before(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.fineValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasFineValiditaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QBadge.badge.fineValidita.between(param1, param2) : null;
	 }

}