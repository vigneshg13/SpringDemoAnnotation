package com.luv2code.spring.practice;

public class SoccerCoach implements Coach {

	private PracticeFortuneService theFortuneService;
	
	public SoccerCoach(PracticeFortuneService fortuneService) {
		this.theFortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Do a Ball Doubling and Tripling with team for 45 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
