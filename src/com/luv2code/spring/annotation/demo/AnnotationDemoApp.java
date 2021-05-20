package com.luv2code.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
