package com.luv2code.spring.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//get the bean from spring contatiner
		SwimCoach myCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(myCoach.getDailyWorkOut());
		
		// call Fortune method on the bean
		System.out.println(myCoach.getDailyFortune());
		
		// call getter from swimcoach
		System.out.println("Email : "+myCoach.getEmail());
		System.out.println("Team : "+myCoach.getTeam());
		//close the context
		context.close();

	}

}
