package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class UnhappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "you have 0.000001 % luck today and for the entire life";
	}

}
