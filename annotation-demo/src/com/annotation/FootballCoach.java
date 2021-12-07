package com.annotation;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Value("${demo.mySecretValue}")
	private String secret;
	
	
	
	@Autowired
	@Qualifier("unhappyFortuneService")
//	@Qualifier("happyFortuneService")
	FortuneService fortuneService;
	
	@PostConstruct
	@PreDestroy
	private void Test() {
		System.out.println("This is a freaking init-method test");
	}
	
	
	@PreDestroy
	private void Test1() {
		System.out.println("this is a freaking destroy-method");
	}

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
		System.out.println("secret is :"+ secret);
		return fortuneService.getFortune();
	}

}
