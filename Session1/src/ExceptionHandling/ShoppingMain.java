package ExceptionHandling;

import java.util.Scanner;

public class ShoppingMain {

	public static void main(String[] args) {

		Shopping Shop = new Shopping ();

		Scanner sc= new Scanner (System.in);

		System.out.println("Enter Balance");

		int balance= sc.nextInt();// store input in balance variable

		System.out.println("Enter Product Cost");

		int cost = sc.nextInt();//store input in balance variable
		
		try {
			int UpdatedBalance = Shop.buyProduct(balance,cost);

			System.out.println("Your balance after Shopping"+ " " +UpdatedBalance);
			
		}catch(ArithmeticException e) {
			System.out.println("You have insufficient balance");
		}

	}
}
