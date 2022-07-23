package com.play.performance.Play.Performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PlayPerformanceApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(PlayPerformanceApplication.class, args);
	}

	public static ApplicationContext getContext(){
		return context;
	}
}
