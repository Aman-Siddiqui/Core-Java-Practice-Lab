package Package3;

import java.util.Scanner;

public class GetSetScanner {

	public static void main(String[] args) {

		Scanner s =  new Scanner(System.in);
		User k = new User();

		System.out.println("Enter first name");
		k.setFirstName(s.nextLine());
		

		System.out.println("Enter Last name");
		k.setLastName(s.nextLine());

		System.out.println("Enter age");
		k.setAge(s.nextInt());

		System.err.println("information of existing user");
		
		System.out.println("First Name: "+ "  " + "Last Name: " + "  " +"Age: ");
		
		System.out.println(k.getFirstName()+"                      "+k.getLastName()+"      "+k.getAge());
		
		
	}

}
