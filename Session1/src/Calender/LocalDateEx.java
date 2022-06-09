package Calender;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Today is date : " + today);
		LocalDate zone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		LocalDate zone1 = LocalDate.now(ZoneId.of("Europe/Berlin"));
		LocalDate zone2 = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(zone2);
		
		
		// same method use for time also
	}

}
