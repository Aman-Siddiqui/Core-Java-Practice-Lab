package Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCal {  // GregorianCal is subclass of Calendar. and it is used globally

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day_of_month = calendar.get(Calendar.DAY_OF_MONTH);  // month is index based january indexing starts from 0
		int week_of_year = calendar.get(Calendar.WEEK_OF_YEAR);
		int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day_of_month);
		System.out.println(week_of_year);
		System.out.println(week_of_month);
		
		
	}

}
