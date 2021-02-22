package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date convertToDate(String date) {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    	sdf.setLenient(false);
    	Date d = null;
    	try {
    		d=sdf.parse(date);
    	}
    	catch(ParseException  e) {
    		e.printStackTrace();
    	}
		return d;
    }
}
