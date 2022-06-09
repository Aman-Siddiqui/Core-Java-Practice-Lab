package Session2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Name: ");
	
	   String name = sc.nextLine();
	   
//	   System.out.println("name: "+name);
	   
	   System.out.println("Enter surname: ");
	   
	   String surname= sc.nextLine();
	   
//	   System.out.println("surname: "+surname);
	   
	   String fullname = name+surname;
	   
	   System.out.println("fullname: "+fullname);
	   
	   
	}

}
