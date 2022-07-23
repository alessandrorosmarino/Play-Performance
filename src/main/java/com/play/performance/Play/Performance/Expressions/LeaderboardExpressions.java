package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QLeaderboard;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class LeaderboardExpressions {

	 public static final QLeaderboard TABLE = QLeaderboard.leaderboard;

	 public static BooleanExpression hasIdLeaderboardEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdLeaderboardBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.eq(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.ne(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.in(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.loe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.lt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.goe(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idDominio.gt(param) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdDominioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idDominio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.idTipoLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idTipoLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.idTipoLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasOpzionaleEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.eq(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.eq(param) : null;
	 }

	 public static BooleanExpression containsOpzionale(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.contains(param) : null;
	 }

	 public static BooleanExpression containsOpzionale(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.contains(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.ne(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.ne(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.in(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.in(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.notIn(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.notIn(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.like(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.like(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.notLike(param) : null;
	 }

	 public static BooleanExpression hasOpzionaleNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.opzionale.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.eq(param) : null;
	 }

	 public static BooleanExpression containsNome(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.contains(param) : null;
	 }

	 public static BooleanExpression containsNome(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.in(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.like(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.nome.notLike(param) : null;
	 }

	 public static BooleanExpression hasVisibileEq(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.visibile.eq(param) : null;
	 }

	 public static BooleanExpression hasVisibileEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.visibile.eq(param) : null;
	 }

	 public static BooleanExpression hasVisibileNe(boolean param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.visibile.ne(param) : null;
	 }

	 public static BooleanExpression hasVisibileNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.visibile.ne(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.after(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.after(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.before(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataInizioConteggio.before(param) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.dataInizioConteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataInizioConteggioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.dataInizioConteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioEq(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.eq(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioNe(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.ne(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioAfter(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.after(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioAfter(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.after(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioBefore(Date param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.before(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioBefore(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.dataFineConteggio.before(param) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioBetween(Date param1,Date param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.dataFineConteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasDataFineConteggioBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.dataFineConteggio.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNumeroResetEq(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.eq(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.eq(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetNe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.ne(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.ne(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.in(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.in(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetNotIn(List<Integer> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.notIn(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.notIn(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetLoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.loe(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.loe(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetLt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.lt(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.lt(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetGoe(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.goe(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.goe(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetGt(int param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.gt(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboard.leaderboard.numeroReset.gt(param) : null;
	 }

	 public static BooleanExpression hasNumeroResetBetween(int param1,int param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.numeroReset.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNumeroResetBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboard.leaderboard.numeroReset.between(param1, param2) : null;
	 }

}