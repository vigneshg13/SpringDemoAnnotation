package com.luv2code.spring.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		//Create a context for spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaPracticeConfig.class);
		
		// Reterive Beans from the Java config
		Coach socCoach = context.getBean("soccerCoach",Coach.class);
		
		// call the methods on the bean
		System.out.println(socCoach.getDailyWorkOut());
		System.out.println(socCoach.getDailyFortune());
		
		//close the context
		context.close();
		

	}

}
