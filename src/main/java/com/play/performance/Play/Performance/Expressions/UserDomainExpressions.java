package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QUserDomain;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class UserDomainExpressions {

	 public static final QUserDomain TABLE = QUserDomain.userDomain;

	 public static BooleanExpression hasIdEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdUtenteEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.eq(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.ne(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.in(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.loe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.lt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.goe(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idUtente.gt(param) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdUtenteBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.idUtente.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasUsernameEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.eq(param) : null;
	 }

	 public static BooleanExpression hasUsernameEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.eq(param) : null;
	 }

	 public static BooleanExpression containsUsername(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.contains(param) : null;
	 }

	 public static BooleanExpression containsUsername(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.contains(param) : null;
	 }

	 public static BooleanExpression hasUsernameNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.ne(param) : null;
	 }

	 public static BooleanExpression hasUsernameNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.ne(param) : null;
	 }

	 public static BooleanExpression hasUsernameIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.in(param) : null;
	 }

	 public static BooleanExpression hasUsernameIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.in(param) : null;
	 }

	 public static BooleanExpression hasUsernameNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.notIn(param) : null;
	 }

	 public static BooleanExpression hasUsernameNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.notIn(param) : null;
	 }

	 public static BooleanExpression hasUsernameLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.like(param) : null;
	 }

	 public static BooleanExpression hasUsernameLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.like(param) : null;
	 }

	 public static BooleanExpression hasUsernameNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.notLike(param) : null;
	 }

	 public static BooleanExpression hasUsernameNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.username.notLike(param) : null;
	 }

	 public static BooleanExpression hasPasswordEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.eq(param) : null;
	 }

	 public static BooleanExpression hasPasswordEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.eq(param) : null;
	 }

	 public static BooleanExpression containsPassword(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.contains(param) : null;
	 }

	 public static BooleanExpression containsPassword(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.contains(param) : null;
	 }

	 public static BooleanExpression hasPasswordNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.ne(param) : null;
	 }

	 public static BooleanExpression hasPasswordNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.ne(param) : null;
	 }

	 public static BooleanExpression hasPasswordIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.in(param) : null;
	 }

	 public static BooleanExpression hasPasswordIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.in(param) : null;
	 }

	 public static BooleanExpression hasPasswordNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.notIn(param) : null;
	 }

	 public static BooleanExpression hasPasswordNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.notIn(param) : null;
	 }

	 public static BooleanExpression hasPasswordLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.like(param) : null;
	 }

	 public static BooleanExpression hasPasswordLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.like(param) : null;
	 }

	 public static BooleanExpression hasPasswordNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.notLike(param) : null;
	 }

	 public static BooleanExpression hasPasswordNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.password.notLike(param) : null;
	 }

	 public static BooleanExpression hasLockedEq(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.locked.eq(param) : null;
	 }

	 public static BooleanExpression hasLockedEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.locked.eq(param) : null;
	 }

	 public static BooleanExpression hasLockedNe(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.locked.ne(param) : null;
	 }

	 public static BooleanExpression hasLockedNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.locked.ne(param) : null;
	 }

	 public static BooleanExpression hasCredentialExpiredEq(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.credentialExpired.eq(param) : null;
	 }

	 public static BooleanExpression hasCredentialExpiredEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.credentialExpired.eq(param) : null;
	 }

	 public static BooleanExpression hasCredentialExpiredNe(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.credentialExpired.ne(param) : null;
	 }

	 public static BooleanExpression hasCredentialExpiredNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.credentialExpired.ne(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.eq(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.eq(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.ne(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.ne(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.after(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.after(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.before(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QUserDomain.userDomain.lastModified.before(param) : null;
	 }

	 public static BooleanExpression hasLastModifiedBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.lastModified.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasLastModifiedBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QUserDomain.userDomain.lastModified.between(param1, param2) : null;
	 }

}