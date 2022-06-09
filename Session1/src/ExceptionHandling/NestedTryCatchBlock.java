package ExceptionHandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try {
			String s = "aman";
			for(int i=0; i<6; i++) {
				System.out.println(s.charAt(i));}
			

			try {
				System.out.println("going to divide by zero");
				int b = 39/0;
			}catch (ArithmeticException e) {
				System.out.println(e);}
			
			
			
			try {
				int a[]= new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);}
			

		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Normal Flow..");
	}
}