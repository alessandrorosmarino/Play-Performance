package com.play.performance.Play.Performance.RuleLogic.Utils;

import com.play.performance.Play.Performance.RuleLogic.DataObjects.FieldValue;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleLogicOperator;
import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleTarget;
import com.play.performance.Play.Performance.RuleLogic.Expression.RuleExpressionResolver;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.BooleanOperation;

import javax.persistence.Id;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class RuleLogicUtils {

    private static final String CLASS_EXPRESSION_SUFFIX = "Expressions";

    public static BooleanExpression buildTargetQuery(RuleTarget target) {
        BooleanExpression booleanExpression = null;
        try {
            Class targetClass = Class.forName(target.getTargetClassName());
            Class targetExpressionClass = Class.forName(target.getTargetExpressionsClassName());
            List<FieldValue> targetFieldValueList = target.getFieldValueList();
            Field[] fieldArray = targetClass.getDeclaredFields();
            Field targetIdField = null;
            for(Field field : fieldArray){
                if(field.isAnnotationPresent(Id.class)){
                    targetIdField = field;
                }
                for(FieldValue targetFieldValue : targetFieldValueList){
                    if(targetFieldValue.getFieldName().equals(field.getName())){
                        Method targetBooleanExpressionMethod = targetExpressionClass.getMethod(
                                RuleExpressionResolver.resolveFieldExpression(field.getName(),targetFieldValue.getOperator()),field.getType());
                        BooleanExpression targetBooleanExpressionMethodResult = (BooleanExpression) targetBooleanExpressionMethod.invoke(null,targetFieldValue.getFieldValue());
                        booleanExpression = PlayPerformanceUtils.isEmpty(booleanExpression) ? targetBooleanExpressionMethodResult
                                : booleanExpression.and(targetBooleanExpressionMethodResult);
                    }
                }
            }
            if(PlayPerformanceUtils.isNotEmpty(target.getTargetIdList()) && PlayPerformanceUtils.isNotEmpty(targetIdField)){
                Method targetBooleanExpressionMethod = targetExpressionClass.getMethod(
                        RuleExpressionResolver.resolveFieldExpression(targetIdField.getName(), RuleLogicOperator.IN),List.class);
                BooleanExpression targetBooleanExpressionMethodResult = (BooleanExpression) targetBooleanExpressionMethod.invoke(null,target.getTargetIdList());
                booleanExpression = booleanExpression.and(targetBooleanExpressionMethodResult);
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return booleanExpression;
    }
}
