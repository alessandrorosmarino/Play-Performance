package com.play.performance.Play.Performance.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;

public class PlayPerformanceUtils {

	public static <T> ExampleMatcher buildExampleMatcherForClass(T object) {
		return buildExampleMatcherForClass(object, false,true, null);
	}
	
	public static <T> ExampleMatcher buildExampleMatcherForClassIgnoringFields(T object, String[] fieldsToIgnore) {
		return buildExampleMatcherForClass(object, false,true, fieldsToIgnore);
	}
	
	public static <T> ExampleMatcher buildExampleMatcherForClass(T object, boolean ignoreCase, boolean exactMatch, String[] fieldsToIgnore) {
		ExampleMatcher matcher = ExampleMatcher.matchingAll();
		for(Field field : object.getClass().getDeclaredFields()) {
			boolean hasValue = false;
			boolean ignoredField = false;
			if(isNotEmpty(fieldsToIgnore)) {
				for(String fieldToIgnore : fieldsToIgnore) {
					if(fieldToIgnore.equals(field.getName())) {
						ignoredField=true;
					}
				}
			}
			if(!ignoredField) {
				Object objectValue;
				try {
					Method method = object.getClass().getMethod("get"+
							field.getName().substring(0,1).toUpperCase()+
							field.getName().substring(1));
					objectValue = method.invoke(object);
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | 
						IllegalArgumentException | InvocationTargetException e1) {
					objectValue = null;
				}
				if(field.getType().isPrimitive()) {
					if(field.getType().equals(Long.TYPE)) {
						if(Long.valueOf(objectValue.toString()).longValue() != 0) { hasValue = true; }
					}else if(field.getType().equals(Integer.TYPE)) {
						if(Integer.valueOf(objectValue.toString()).intValue() != 0) { hasValue = true; }
					}else if(field.getType().equals(Float.TYPE)) {
						if(Float.valueOf(objectValue.toString()).floatValue() != 0) { hasValue = true; }
					}else if(field.getType().equals(Double.TYPE)) {
						if(Double.valueOf(objectValue.toString()).doubleValue() != 0) { hasValue = true; }
					}else if(field.getType().equals(Short.TYPE)) {
						if(Short.valueOf(objectValue.toString()).shortValue() != 0) { hasValue = true; }
					}else if(field.getType().equals(Character.TYPE)) {
						if(!Character.isWhitespace(Character.valueOf(objectValue.toString().charAt(0)).charValue())) { hasValue = true; }
					}
				}else {
					if(isNotEmpty(objectValue)) {
						if(field.getType().equals(String.class)) {
							hasValue = true;
							if(ignoreCase) {
								matcher = matcher.withIgnoreCase();
							}
							if(exactMatch) {
								matcher = matcher.withStringMatcher(StringMatcher.EXACT);
							}
						}
					}
				}
			}
			if(!hasValue) {
				matcher = matcher.withIgnorePaths(field.getName());
			}
		}
		return matcher;
	}
	
	public static <T> boolean isEmpty(T object) {
		if(object == null || object.equals(null)) {
			return true;
		}else if(object.getClass().isArray()) {
			List<?> list = Arrays.asList(object);
			return list.isEmpty();
		}else if(object instanceof List) {
			List<?> list = (List<?>) object;
			return list.isEmpty();
		}else if(object instanceof String) {
			String string = object.toString();
			return string.isEmpty();
		}
		return false;
	}

	public static <T> boolean isNotEmpty(T object) {
		return !isEmpty(object);
	}
	
	public static <T> T processOptionalEntity(Optional<T> optional){
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
}
