package Calender;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterEx {

	public static void main(String[] args) {

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ssz");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("YYYY/MM/dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		
		ZonedDateTime zdt1 = ZonedDateTime.now();
		
		String Formatter1 = dtf1.format(zdt1);
		String Formatter2 = dtf2.format(zdt1);
		String Formatter3 = dtf3.format(zdt1);
		
		System.out.println(Formatter1);
		System.out.println(Formatter2);
		System.out.println(Formatter3);
		
	}

}
