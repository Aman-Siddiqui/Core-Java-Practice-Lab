package Copied;

import java.util.Scanner;

public class BasicCalcSwitchCase {

	public static void main(String[] args) {
              int result = 0;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter First Value");
		int a = obj.nextInt();
		
		System.out.println("Enter Second Value");
		int b = obj.nextInt();
		
		System.out.println("operator");
		char operator = obj.next().charAt(0);
               
		switch(operator) { 
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
		System.out.println(result);

}
}