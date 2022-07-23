package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QDomainPointsType;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class DomainPointsTypeExpressions {

	 public static final QDomainPointsType TABLE = QDomainPointsType.domainPointsType;

	 public static BooleanExpression hasIdEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.eq(param) : null;
	 }

	 public static BooleanExpression hasIdNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.ne(param) : null;
	 }

	 public static BooleanExpression hasIdIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.in(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.lt(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.goe(param) : null;
	 }

	 public static BooleanExpression hasIdGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.id.gt(param) : null;
	 }

	 public static BooleanExpression hasIdBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.id.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.idTipoPunti.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoPuntiBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.idTipoPunti.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasPrincipaleEq(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.principale.eq(param) : null;
	 }

	 public static BooleanExpression hasPrincipaleEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.principale.eq(param) : null;
	 }

	 public static BooleanExpression hasPrincipaleNe(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.principale.ne(param) : null;
	 }

	 public static BooleanExpression hasPrincipaleNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.principale.ne(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.eq(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.eq(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.ne(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.ne(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.in(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.in(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.notIn(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.notIn(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.loe(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.loe(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.lt(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.lt(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.goe(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.goe(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.gt(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.gt(param) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasMoltiplicatoreBaseBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QDomainPointsType.domainPointsType.moltiplicatoreBase.between(param1, param2) : null;
	 }

}