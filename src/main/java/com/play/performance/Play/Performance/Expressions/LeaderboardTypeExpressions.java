package com.play.performance.Play.Performance.Expressions;

import com.play.performance.Play.Performance.DataObjects.QLeaderboardType;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.Date;
import java.util.List;

public class LeaderboardTypeExpressions {

	 public static final QLeaderboardType TABLE = QLeaderboardType.leaderboardType;

	 public static BooleanExpression hasIdTipoLeaderboardEq(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.eq(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.ne(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.in(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNotIn(List<Long> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.notIn(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.loe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardLt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.lt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGoe(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGoe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.goe(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGt(long param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardGt(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.gt(param) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardBetween(long param1,long param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasIdTipoLeaderboardBetween(Expression param1,Expression param2) {
		return PlayPerformanceUtils.isNotEmpty(param1) && PlayPerformanceUtils.isNotEmpty(param2) ?  QLeaderboardType.leaderboardType.idTipoLeaderboard.between(param1, param2) : null;
	 }

	 public static BooleanExpression hasNomeTipoEq(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.eq(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoEq(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.eq(param) : null;
	 }

	 public static BooleanExpression containsNomeTipo(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.contains(param) : null;
	 }

	 public static BooleanExpression containsNomeTipo(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.contains(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNe(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNe(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.ne(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.in(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.in(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNotIn(List<String> param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNotIn(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.notIn(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.like(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.like(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNotLike(String param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.notLike(param) : null;
	 }

	 public static BooleanExpression hasNomeTipoNotLike(Expression param) {
		return PlayPerformanceUtils.isNotEmpty(param) ?  QLeaderboardType.leaderboardType.nomeTipo.notLike(param) : null;
	 }

}