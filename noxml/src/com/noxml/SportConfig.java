package com.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.noxml")
@PropertySource("classpath:config.properties")
@PropertySource("classpath:myLogger.properties")
public class SportConfig {
	
	@Value("${root.logger.level}")
	private String test;
	
	@Value("${foo.name}")
	private String test1;
	
	@Bean
	public FortuneService happyFortuneService() {
		System.out.println(test);
		System.out.println(test1);
		return new HappyFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		SwimCoach swimCoach = new SwimCoach(happyFortuneService());
		return swimCoach;
	}
}
