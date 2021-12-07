package com.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.noxml")
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach swimCoach = new SwimCoach(happyFortuneService());
		return swimCoach;
	}
}
