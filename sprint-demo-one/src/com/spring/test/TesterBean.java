package com.spring.test;

public class TesterBean {
	
	public String test;
	public void initBean() {
		System.out.println("this method is automatically called");
		System.out.println("test is " +test);
	}
	
	public TesterBean(String test) {
		this.test = test;
	}
	

}

