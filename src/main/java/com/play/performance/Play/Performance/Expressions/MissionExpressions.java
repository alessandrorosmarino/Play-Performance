package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QMission;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class MissionExpressions {

	 public static final QMission TABLE = QMission.mission;

	 public static BooleanExpression hasIdMissioneEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.eq(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.eq(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.ne(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.ne(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.in(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.in(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.loe(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.loe(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.lt(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.lt(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.goe(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.goe(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.gt(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idMissione.gt(param) : null;
	 }

	 public static BooleanExpression hasIdMissioneBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.idMissione.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdMissioneBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.idMissione.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.eq(param) : null;
	 }

	 public static BooleanExpression containsNome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.contains(param) : null;
	 }

	 public static BooleanExpression containsNome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.eq(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.eq(param) : null;
	 }

	 public static BooleanExpression containsDescrizione(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.contains(param) : null;
	 }

	 public static BooleanExpression containsDescrizione(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.contains(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.ne(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.ne(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.in(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.in(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.notIn(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.notIn(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.like(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.like(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.notLike(param) : null;
	 }

	 public static BooleanExpression hasDescrizioneNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.descrizione.notLike(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.in(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.in(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.notIn(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.notIn(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.loe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.loe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.lt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.lt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.goe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.goe(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.gt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.valorePunteggio.gt(param) : null;
	 }

	 public static BooleanExpression hasValorePunteggioBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.valorePunteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasValorePunteggioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.valorePunteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasInizioValiditaEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.after(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.after(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.before(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.inizioValidita.before(param) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.inizioValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasInizioValiditaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.inizioValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasFineValiditaEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.eq(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.ne(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.after(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.after(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.before(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QMission.mission.fineValidita.before(param) : null;
	 }

	 public static BooleanExpression hasFineValiditaBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.fineValidita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasFineValiditaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QMission.mission.fineValidita.between(param1, param2) : null;
	 }

}