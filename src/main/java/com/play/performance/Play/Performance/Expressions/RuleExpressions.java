package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QRule;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class RuleExpressions {

	 public static final QRule TABLE = QRule.rule;

	 public static BooleanExpression hasIdRegolaEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.eq(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.eq(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.ne(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.ne(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.in(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.in(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.loe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.loe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.lt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.lt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.goe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.goe(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.gt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idRegola.gt(param) : null;
	 }

	 public static BooleanExpression hasIdRegolaBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRule.rule.idRegola.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdRegolaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRule.rule.idRegola.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRule.rule.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QRule.rule.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.eq(param) : null;
	 }

	 public static BooleanExpression containsNome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.contains(param) : null;
	 }

	 public static BooleanExpression containsNome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.eq(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.eq(param) : null;
	 }

	 public static BooleanExpression containsDescrizione(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.contains(param) : null;
	 }

	 public static BooleanExpression containsDescrizione(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.contains(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.ne(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.ne(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.in(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.in(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.notIn(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.notIn(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.like(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.like(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.notLike(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.descrizione.notLike(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.eq(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.eq(param) : null;
	 }

	 public static BooleanExpression containsImplementazione(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.contains(param) : null;
	 }

	 public static BooleanExpression containsImplementazione(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.contains(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.ne(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.ne(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.in(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.in(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.notIn(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.notIn(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.like(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.like(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.notLike(param) : null;
	 }

	 public static BooleanExpression hasImplementazioneNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QRule.rule.implementazione.notLike(param) : null;
	 }

}