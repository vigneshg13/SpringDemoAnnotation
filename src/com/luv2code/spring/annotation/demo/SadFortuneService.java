package com.luv2code.spring.annotation.demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}

}
