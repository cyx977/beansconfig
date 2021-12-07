package com.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("unhappyFortuneService")
//	@Qualifier("happyFortuneService")
	FortuneService fortuneService;
	

//	public FootballCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void someCrazyMedhod(FortuneService fortuneService) {
//		System.out.println("some crazy method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String train() {
		return "Run 1 km everyday";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

}
