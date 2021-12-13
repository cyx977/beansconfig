package com.hibtut.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date parseDate(String dateStr) throws ParseException {
		return dateFormat.parse(dateStr);
	}
	
	public static String formatDate(Date date) {
		String result = null;
        
        if (date != null) {
            result = dateFormat.format(date);
        }
        
        return result;
	}
}
