package Calender;

import java.util.*;

public class Calender1Ex {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
//		System.out.println(c.getTime());
		
		 System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
	        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
	        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
	        System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
	        
	        int max1 = c.getMaximum(Calendar.DAY_OF_WEEK);
	        System.out.println("Maximum number of days in week: " + max1);
	          
	        int max = c.getMaximum(Calendar.WEEK_OF_YEAR);
	        System.out.println("Maximum number of weeks in year: " + max);
	        
	       
	        
	        c.add(Calendar.DATE, -15);
	        System.out.println("15 days ago: " + c.getTime());
	        
	        c.add(Calendar.MONTH, 4);
	        System.out.println("4 months later: " + c.getTime());
	        
	        c.add(Calendar.YEAR, 2);
	        System.out.println("2 years later: " + c.getTime());



	}

}
