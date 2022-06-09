package Calender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		
		String str = sdf.format(d);
		
		System.out.println(str);
		
		
		
	}
}
