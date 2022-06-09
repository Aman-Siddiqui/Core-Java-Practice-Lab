package Session2;

import java.util.Scanner;

public class BasicCalcSwtichCase {

	public static void main(String[] args) {

		double result=0;
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter First Value :");
		double a =obj.nextDouble();

		System.out.println("Enter Second Value :");
		double b = obj.nextDouble();

		System.out.println("Choose operator :");
		char operator = obj.next().charAt(0);

		switch (operator){
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		case '%':
			result = a%b;
			break;
		default: 
			System.out.println("Invalid Input");
			break;
		}
            System.out.println("Result:" + result);
	}

}
