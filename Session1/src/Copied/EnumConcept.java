package Copied;



public class EnumConcept {
	
	 enum Days{
			Sunday,
			Monday,
			Tuesday,
			Wednesday,
			Thursday,
			Friday,
			Saturday,
			
		}
	public static void main(String[] args) {
		
	for (Days d : Days.values()) {
	
	}
	System.out.println(Days.valueOf("Monday").ordinal());
	}

}
