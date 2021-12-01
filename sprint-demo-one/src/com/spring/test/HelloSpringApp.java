package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach b = context.getBean("baseballCoach", Coach.class);
		Coach t = context.getBean("trackCoach", Coach.class);
		System.out.println(b.getDailyWorkout());
		System.out.println(t.getDailyWorkout());
		// call method on the bean
		// close the context
	}
}
