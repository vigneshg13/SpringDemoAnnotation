package com.luv2code.spring.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfiDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//get the bean from spring contatiner
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(myCoach.getDailyWorkOut());
		
		// call Fortune method on the bean
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
