package com.cdac.acts.dateutil;
import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	/*Create Person class with basic details like 
	 * addharNumber, name, date of birth, address ( use Adress class for this). 
	 * Find out whether the person is born before 15th August 1947.
	 */
	
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	public static String getFormattedDate(Date inputDate) {
		if(inputDate == null) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(inputDate);
		
	}
	
	
	public static Date getDate(String strDate) throws ParseException {
		
		if ( strDate == null || EMPTY.equals(strDate)) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strDate);
		return date;
		
	}
	
	
}
