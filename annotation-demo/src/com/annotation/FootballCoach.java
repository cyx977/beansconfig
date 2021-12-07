package com.annotation;

import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {

	@Override
	public String train() {
		return "Run 1 km everyday";
	}

}
