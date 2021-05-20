package com.luv2code.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired -@Autowired annotation on such a constructor is no longer necessary 
	 *if the target bean only defines one constructor to begin with. 
	 *However, if several constructors are available, at least one must be annotated 
	 *to teach the container which one to use.
	*/
	public CricketCoach(){
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Do a bowling practice for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
