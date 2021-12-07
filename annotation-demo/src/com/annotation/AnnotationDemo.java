package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Coach c = context.getBean("footballCoach", Coach.class);
		System.out.println(((FootballCoach)c).getFortune());
		final String[] test1 = {"A", "b"};
		test1[1]= "sth else";
		System.out.println(test1[1]);
	}
}
