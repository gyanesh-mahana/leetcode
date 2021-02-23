package com.misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInSpecificFormat {

	public static String dateToFormat(String formatType, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatType);
		return sdf.format(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String format = "dd-mm-yyyy";
		Date date = new Date();
		System.out.println(dateToFormat(format, date));

	}

}
