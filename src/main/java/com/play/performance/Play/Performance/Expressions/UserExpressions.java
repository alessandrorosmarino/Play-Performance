package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QUser;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class UserExpressions {

	 public static final QUser TABLE = QUser.user;

	 public static BooleanExpression hasIdUtenteEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.eq(param) : null;
	 }

	 public static BooleanExpression containsNome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.contains(param) : null;
	 }

	 public static BooleanExpression containsNome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasCognomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.eq(param) : null;
	 }

	 public static BooleanExpression hasCognomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.eq(param) : null;
	 }

	 public static BooleanExpression containsCognome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.contains(param) : null;
	 }

	 public static BooleanExpression containsCognome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.contains(param) : null;
	 }

	 public static BooleanExpression hasCognomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.ne(param) : null;
	 }

	 public static BooleanExpression hasCognomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.ne(param) : null;
	 }

	 public static BooleanExpression hasCognomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.in(param) : null;
	 }

	 public static BooleanExpression hasCognomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.in(param) : null;
	 }

	 public static BooleanExpression hasCognomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.notIn(param) : null;
	 }

	 public static BooleanExpression hasCognomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.notIn(param) : null;
	 }

	 public static BooleanExpression hasCognomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.like(param) : null;
	 }

	 public static BooleanExpression hasCognomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.like(param) : null;
	 }

	 public static BooleanExpression hasCognomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.notLike(param) : null;
	 }

	 public static BooleanExpression hasCognomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.cognome.notLike(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.eq(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.eq(param) : null;
	 }

	 public static BooleanExpression containsCodiceFiscale(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.contains(param) : null;
	 }

	 public static BooleanExpression containsCodiceFiscale(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.contains(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.ne(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.ne(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.in(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.in(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.notIn(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.notIn(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.like(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.like(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.notLike(param) : null;
	 }

	 public static BooleanExpression hasCodiceFiscaleNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.codiceFiscale.notLike(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.eq(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.eq(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.ne(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.ne(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.after(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.after(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.before(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.dataNascita.before(param) : null;
	 }

	 public static BooleanExpression hasDataNascitaBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.dataNascita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataNascitaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.dataNascita.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.eq(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.eq(param) : null;
	 }

	 public static BooleanExpression containsLuogoNascita(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.contains(param) : null;
	 }

	 public static BooleanExpression containsLuogoNascita(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.contains(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.ne(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.ne(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.in(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.in(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.notIn(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.notIn(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.like(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.like(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.notLike(param) : null;
	 }

	 public static BooleanExpression hasLuogoNascitaNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.luogoNascita.notLike(param) : null;
	 }

	 public static BooleanExpression hasSessoEq(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.eq(param) : null;
	 }

	 public static BooleanExpression hasSessoEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.eq(param) : null;
	 }

	 public static BooleanExpression hasSessoNe(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.ne(param) : null;
	 }

	 public static BooleanExpression hasSessoNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.ne(param) : null;
	 }

	 public static BooleanExpression hasSessoIn(List<Character> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.in(param) : null;
	 }

	 public static BooleanExpression hasSessoIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.in(param) : null;
	 }

	 public static BooleanExpression hasSessoNotIn(List<Character> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.notIn(param) : null;
	 }

	 public static BooleanExpression hasSessoNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.notIn(param) : null;
	 }

	 public static BooleanExpression hasSessoLoe(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.loe(param) : null;
	 }

	 public static BooleanExpression hasSessoLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.loe(param) : null;
	 }

	 public static BooleanExpression hasSessoLt(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.lt(param) : null;
	 }

	 public static BooleanExpression hasSessoLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.lt(param) : null;
	 }

	 public static BooleanExpression hasSessoGoe(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.goe(param) : null;
	 }

	 public static BooleanExpression hasSessoGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.goe(param) : null;
	 }

	 public static BooleanExpression hasSessoGt(char param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.gt(param) : null;
	 }

	 public static BooleanExpression hasSessoGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.sesso.gt(param) : null;
	 }

	 public static BooleanExpression hasSessoBetween(char param1,char param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.sesso.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasSessoBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.sesso.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.eq(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.eq(param) : null;
	 }

	 public static BooleanExpression containsIndirizzoResidenza(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.contains(param) : null;
	 }

	 public static BooleanExpression containsIndirizzoResidenza(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.contains(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.like(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.like(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.notLike(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoResidenzaNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoResidenza.notLike(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.eq(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.eq(param) : null;
	 }

	 public static BooleanExpression containsProvinciaResidenza(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.contains(param) : null;
	 }

	 public static BooleanExpression containsProvinciaResidenza(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.contains(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.like(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.like(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.notLike(param) : null;
	 }

	 public static BooleanExpression hasProvinciaResidenzaNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaResidenza.notLike(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.eq(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.eq(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.ne(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.in(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.notIn(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.loe(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.loe(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.lt(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.lt(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.goe(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.goe(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.gt(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoResidenza.gt(param) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.civicoResidenza.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasCivicoResidenzaBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.civicoResidenza.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression containsIndirizzoDomicilio(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.contains(param) : null;
	 }

	 public static BooleanExpression containsIndirizzoDomicilio(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.contains(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.like(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.like(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.notLike(param) : null;
	 }

	 public static BooleanExpression hasIndirizzoDomicilioNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.indirizzoDomicilio.notLike(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression containsProvinciaDomicilio(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.contains(param) : null;
	 }

	 public static BooleanExpression containsProvinciaDomicilio(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.contains(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.like(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.like(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.notLike(param) : null;
	 }

	 public static BooleanExpression hasProvinciaDomicilioNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.provinciaDomicilio.notLike(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.eq(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.ne(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.in(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.notIn(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.loe(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.loe(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.lt(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.lt(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.goe(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.goe(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.gt(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUser.user.civicoDomicilio.gt(param) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.civicoDomicilio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasCivicoDomicilioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUser.user.civicoDomicilio.between(param1, param2) : null;
	 }

}