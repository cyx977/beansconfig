package com.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach b = context.getBean("baseballCoach", Coach.class);
		System.out.println(b.getWorkout());
		Coach s = context.getBean("swimCoach", Coach.class);
		System.out.println(s.getWorkout());
		System.out.println(((SwimCoach)s).getFortune());
		
		Coach t = context.getBean("swimCoach", Coach.class);
		System.out.println(((SwimCoach)t).getFortune());
		context.close();
	}

}
