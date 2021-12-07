package com.noxml;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	FortuneService fortuneService;
	
	@Override
	public String getWorkout() {
		return "Backward lunge with a twist";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
