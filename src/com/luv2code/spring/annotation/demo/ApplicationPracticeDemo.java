package com.luv2code.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationPracticeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseBallCoach = context.getBean("baseBallCoach",Coach.class);
		
		System.out.println(baseBallCoach.getDailyWorkOut());
		
		context.close();
	}

}
