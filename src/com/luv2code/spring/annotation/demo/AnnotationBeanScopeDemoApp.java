package com.luv2code.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// Read the config file and set the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Get the bean from context
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//call methods from bean
		boolean result = (myCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: "+result);
		System.out.println("Memory location for myCoach: "+myCoach);
		System.out.println("Memory location for alphaCoach: "+alphaCoach);
		//close the context
		context.close();	
	}

}
