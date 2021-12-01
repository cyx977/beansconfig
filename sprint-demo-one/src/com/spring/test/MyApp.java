package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		getExercise(new BaseballCoach());
		getExercise(new TrackCoach());
//		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("a.xml");
	}
	
	public static void getExercise(Coach c) {
		System.out.println(c.getDailyWorkout());
		System.out.println(TrackCoach.class);
		System.out.println(MyLogger.class);
	}
}
