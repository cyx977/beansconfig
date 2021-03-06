package com.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//	Coach b = context.getBean("baseballCoach", Coach.class);
	//	Coach t = context.getBean("trackCoach", Coach.class);
		Coach c = context.getBean("cricketCoach", Coach.class);
	//	System.out.println(b.getDailyWorkout());
	//	System.out.println(t.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		System.out.println(((CricketCoach)c).name);

	}
}
