package com.play.performance.Play.Performance.Repository;

import com.play.performance.Play.Performance.DataObjects.UserDomain;
import com.play.performance.Play.Performance.Expressions.UserDomainExpressions;

public interface UserDomainRepository extends PlayPerformanceRepository<UserDomain, Long> {
    public default UserDomain findUserDomain(UserDomain userDomain){
        return findOne(UserDomainExpressions.hasIdUtenteEq(userDomain.getIdUtente()).
            and(UserDomainExpressions.hasUsernameEq(userDomain.getUsername())).
            and(UserDomainExpressions.hasIdDominioEq(userDomain.getIdDominio()))).get();
    };
}
