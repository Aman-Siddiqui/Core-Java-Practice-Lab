package Copied;

public class EnumTest {
	
		    Day day;
		 
		    // Constructor
		    public EnumTest(Day day) { 
		    	this.day = day; 
		    	}
		 
		    // Prints a line about Day using switch
		    public void dayIsLike()
		    {
		        switch (day) {
		        case MONDAY:
		            System.out.println("Mondays are bad.");
		            break;
		        case FRIDAY:
		            System.out.println("Fridays are better.");
		            break;
		        case SATURDAY:
		        case SUNDAY:
		            System.out.println("Weekends are best.");
		            break;
		        default:
		            System.out.println("Midweek days are so-so.");
		            break;
		        }
		    }
		 
		    // Driver method
		    public static void main(String[] args)
		    {
		        String str = "SATURDAY";
		        EnumTest t1 = new EnumTest(Day.valueOf(str));  //(Day.valueOf(str) is used for converting String to Enum data type
		        t1.dayIsLike();
		    }
		


	}


