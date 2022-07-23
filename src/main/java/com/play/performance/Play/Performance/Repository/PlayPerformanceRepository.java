package com.play.performance.Play.Performance.Repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;

@NoRepositoryBean
public interface PlayPerformanceRepository<T,K> extends CrudRepository<T, K>,QuerydslPredicateExecutor<T> {
}
