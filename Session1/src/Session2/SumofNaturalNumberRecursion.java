package Session2;

import java.util.Scanner;

public class SumofNaturalNumberRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		int sum= addNumbers(number);
		System.out.println("Sum="+sum);
		}
	
	public static int addNumbers(int num) {
		if (num>0) {
			return num + addNumbers(num-1);//5+4
		}else {
			return num;
		}
	}

}
//5+4- pending
//4+3
//3+2
//2+1
//1+0 - pending