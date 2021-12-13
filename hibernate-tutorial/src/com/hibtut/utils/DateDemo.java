package com.hibtut.utils;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		String d = DateParser.formatDate(new Date());

		System.out.println(d);
		System.out.println(DateParser.parseDate(d));
	}

}
