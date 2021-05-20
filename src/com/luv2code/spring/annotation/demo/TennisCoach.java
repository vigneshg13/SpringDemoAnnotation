package com.luv2code.spring.annotation.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theSillycoach") You can create a bean next to component decorator
//Scope is to change the singleton injection to a new instance for each bean reterival from the spring container
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	//Feild Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired - constructor injection
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}
	
  //define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside Tennis Coach: doMyStartupStuff method.");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMydestroyStuff() {
		System.out.println("Inside Tennis Coach: doMydestroyStuff method.");
	}
//	@Autowired  method injection
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
