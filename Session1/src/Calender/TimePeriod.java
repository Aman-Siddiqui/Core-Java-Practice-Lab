package Calender;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {

	public static void main(String[] args) {

		LocalDate localDate1 = LocalDate.of(2000, 04, 07);
		LocalDate localDate2 = LocalDate.of(1995, 12, 24);
		
		Period period = Period.between(localDate1, localDate2);
		
		System.out.println("2000, 04, 07  to"+"  "+ "1995, 09, 24" +"  "+ period);
	}

}
