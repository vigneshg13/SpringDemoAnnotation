package com.luv2code.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.spring.practice")
public class JavaPracticeConfig {
	
	@Bean
	public SoccerFortuneService soccerFortune() {
		return new SoccerFortuneService();
	}
	
	@Bean
	public SoccerCoach soccerCoach() {
		return new SoccerCoach(soccerFortune());
	}

}
