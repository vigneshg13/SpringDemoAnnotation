package com.luv2code.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		System.out.println(" BaseBallCoach : Inside Default Constructor");
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k in morning";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(" BaseBallCoach : Inside setter method");
		this.fortuneService = fortuneService; 
	}

}
