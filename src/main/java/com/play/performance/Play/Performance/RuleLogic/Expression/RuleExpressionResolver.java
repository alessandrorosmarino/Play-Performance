package com.play.performance.Play.Performance.RuleLogic.Expression;

import com.play.performance.Play.Performance.RuleLogic.DataObjects.RuleLogicOperator;

public class RuleExpressionResolver {
    private static final String EMPTY = "";
    private static final String PREFIX = "has";
    private static final String NOT_PREFIX = "Not";
    private static final String CONTAINS_PREFIX = "contains";
    private static final String GT_SUFFIX = "Gt";
    private static final String LT_SUFFIX = "Lt";
    private static final String GOE_SUFFIX = "Goe";
    private static final String LOE_SUFFIX = "Loe";
    private static final String IN_SUFFIX = "In";
    private static final String NOT_IN_SUFFIX = "NotIn";

    public static String resolveFieldExpression(String fieldName, RuleLogicOperator operator){
        return resolveFieldPrefixLogicOperator(operator) + capitalizeWord(fieldName) + resolveFieldSuffixLogicOperator(operator);
    }

    private static String resolveFieldPrefixLogicOperator(RuleLogicOperator operator){
        String prefix = PREFIX;
        switch(operator){
            case NOT_EQUAL -> {
                prefix = prefix + NOT_PREFIX;
            }
            case CONTAINS -> {
                prefix = CONTAINS_PREFIX;
            }
        }
        return prefix;
    }


    private static String resolveFieldSuffixLogicOperator(RuleLogicOperator operator){
        switch(operator){
            case GRATER -> {
                return GT_SUFFIX;
            }
            case GREATER_EQUAL -> {
                return GOE_SUFFIX;
            }
            case LOWER -> {
                return LT_SUFFIX;
            }
            case LOWER_EQUAL -> {
                return LOE_SUFFIX;
            }
            case IN -> {
                return IN_SUFFIX;
            }
            case NOT_IN -> {
                return NOT_IN_SUFFIX;
            }
        }
        return EMPTY;
    }

    private static String capitalizeWord(String word) {
        Character character = word.charAt(0);
        if(Character.isLowerCase(character)) {
            word = word.replaceFirst(character.toString(), character.toString().toUpperCase());
        }
        return word;
    }
}
