package com.spring.test;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a kilometer everyday";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
