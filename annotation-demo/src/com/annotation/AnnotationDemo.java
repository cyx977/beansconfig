package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Coach c = context.getBean("footballCoach", Coach.class);
		System.out.println(c.train());
	}
}
