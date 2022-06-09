package Copied;

public class ArmstrongEx {

	public static void main(String[] args) {
	        int num = 222;
	        int remainder;
	        int result=0;
	        int originalnum = num;
	        
	        while (num!=0) {
	        	remainder = num%10;
	        	result = (int)(result+Math.pow(remainder, 3));
	        	
	        	num = num/10;
	        }
	        if(originalnum==result) {
	        	System.out.println("Number is a armstrong");
	        }else {
	        	System.out.println("Number is not a armstrong");
	        }
	        
	        

	}

}
