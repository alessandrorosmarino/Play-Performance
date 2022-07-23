package com.play.performance.Play.Performance.RuleLogic.DataObjects;

public class FieldValue {
    private String fieldName;
    private String fieldValue;
    private RuleLogicOperator operator;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public RuleLogicOperator getOperator() {
        return operator;
    }

    public void setOperator(RuleLogicOperator operator) {
        this.operator = operator;
    }
}
