package com.play.performance.Play.Performance.RuleLogic.DataObjects;

import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;

import java.util.ArrayList;
import java.util.List;

public class RuleTarget {
    private static final String DATA_OBJECT_PACKAGE_NAME = ".DataObjects.";
    private static final String EXPRESSIONS_PACKAGE_NAME = ".Expressions.";
    private static final String EXPRESSIONS_CLASS_SUFFIX = "Expressions";

    private String targetClassName;
    private String targetExpressionsClassName;
    private List<Long> targetIdList;
    private List<FieldValue> fieldValueList;

    public RuleTarget() {
        targetClassName = "";
        targetIdList = new ArrayList<>();
        fieldValueList = new ArrayList<>();
    }

    public String getTargetClassName() {
        return targetClassName;
    }

    public void setTargetClassName(String targetClassName) {
        boolean classExists = false;
        boolean classExpressionsExists = false;
        try {
            Class targetClass = Class.forName(targetClassName);
            Class targetExpressionsClass = Class.forName(getExpressionsClassName(targetClassName));
            classExists = PlayPerformanceUtils.isNotEmpty(targetClass);
            classExpressionsExists = PlayPerformanceUtils.isNotEmpty(targetExpressionsClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.targetClassName = classExists ? targetClassName : "";
        this.targetExpressionsClassName = classExpressionsExists ? getExpressionsClassName(targetClassName) : "";
    }

    public String getTargetExpressionsClassName() {
        return targetExpressionsClassName;
    }

    public List<Long> getTargetIdList() {
        return targetIdList;
    }

    public void setTargetIdList(List<Long> targetIdList) {
        this.targetIdList = targetIdList;
    }

    public List<FieldValue> getFieldValueList() {
        return fieldValueList;
    }

    public void setFieldValueList(List<FieldValue> fieldValueList) {
        this.fieldValueList = fieldValueList;
    }

    private static String getExpressionsClassName(String className){
        String objectClassName = className.substring(className.lastIndexOf("."));
        return className.replace(DATA_OBJECT_PACKAGE_NAME,EXPRESSIONS_PACKAGE_NAME).replace(objectClassName,objectClassName+EXPRESSIONS_CLASS_SUFFIX);
    }
}
