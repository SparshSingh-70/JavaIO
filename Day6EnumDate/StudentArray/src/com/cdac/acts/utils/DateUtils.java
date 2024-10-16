package com.cdac.acts.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	private DateUtils() {
		// do nothing constructor to stop from object instantiation
	}
	
	
	public static String formatDate(Date date) {
		if(date == null ) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
	
	// apnaa wala
	
	
	public static Date getDate(String strdate) throws ParseException {
		if(strdate == null || EMPTY.equals(strdate)) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strdate);
		
		return date;
		
		
	}
	
	
	
}
