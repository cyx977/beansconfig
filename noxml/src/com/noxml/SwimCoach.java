package com.noxml;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getWorkout() {
		return "do 100 dives today";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
