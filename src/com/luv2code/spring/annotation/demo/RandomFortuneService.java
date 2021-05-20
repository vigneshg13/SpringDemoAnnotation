package com.luv2code.spring.annotation.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create arrays of Strings
	private String[] data= {"Journey is the reward","Diligence is the mother of good luck","Beware of the wolf in sheep's clothing"};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Get random string from the array
		int index = myRandom.nextInt(data.length);
		
		
		return data[index];
	}

}
