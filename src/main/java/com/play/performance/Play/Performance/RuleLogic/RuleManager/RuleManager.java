package com.play.performance.Play.Performance.RuleLogic.RuleManager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.play.performance.Play.Performance.DataObjects.QPoints;
import com.play.performance.Play.Performance.PlayPerformanceApplication;
import com.play.performance.Play.Performance.Repository.PlayPerformanceRepository;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleData;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleTarget;
import com.play.performance.Play.Performance.RuleLogic.Utils.RuleLogicUtils;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class RuleManager {

    private Repositories repositories;

    public RuleManager(){
        setRepositories(new Repositories(PlayPerformanceApplication.getContext()));
    }

    public List<PlayPerformanceRepository> getRepositories() {
        List<PlayPerformanceRepository> repositoryList = new ArrayList<>();
        for (Iterator<Class<?>> iterator = repositories.iterator(); iterator.hasNext(); ) {
            Class<?> classn = iterator.next();
            repositoryList.add(getRepository(classn));
        }
        return repositoryList;
    }

    public void setRepositories(Repositories repositories) {
        this.repositories = repositories;
    }

    public RuleData interpretRule(String jsonString){
        try {
            return new ObjectMapper().readValue(jsonString,RuleData.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public List<Object> processRuleData(RuleData ruleData) {
        List<Object> ruleObjects = new ArrayList<>();
        for(RuleTarget ruleTarget : ruleData.getRuleTargetList()){
            ruleObjects.add(processRuleTarget(ruleTarget));
        }
        return ruleObjects;
    }

    private Iterable processRuleTarget(RuleTarget ruleTarget){
        Iterable ruleObjects = null;
        try {
            Class targetClass = Class.forName(ruleTarget.getTargetClassName());
            PlayPerformanceRepository repository = getRepository(targetClass);
            BooleanExpression booleanExpression = RuleLogicUtils.buildTargetQuery(ruleTarget);
            ruleObjects = repository.findAll(booleanExpression);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ruleObjects;
    }

    public PlayPerformanceRepository getRepository(Class classname){
        Optional<Object> opt = repositories.getRepositoryFor(classname);
        if(opt.isPresent()){
            return (PlayPerformanceRepository) opt.get();
        }
        System.out.println("No repository for classname: " + classname);
        return null;
    }
}
