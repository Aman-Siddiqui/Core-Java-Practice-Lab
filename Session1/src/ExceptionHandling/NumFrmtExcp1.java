package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumFrmtExcp1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		
		try {
			String b = sc.nextLine();
			int a = Integer.parseInt(b);
			System.out.println(a);
		}catch (NumberFormatException e) {
			System.out.println("Enter a Valid Integer");
		}catch (InputMismatchException me) {
			System.out.println("Invalid input");
		}catch(NullPointerException nul) {
			System.out.println("this worked");
		}
		System.out.println("Hello");
		
//		String a = "123";
//		
//		boolean b = Boolean.parseBoolean(a);
//				System.out.println(b);
	}
	
	
	//         sc.nextInt();
	
	

}
