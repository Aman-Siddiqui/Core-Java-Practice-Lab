package ExceptionHandling;

public class NumFrmtExcep {
	public static void main(String args[]) {
		try {
			int sum = 0;
			for (int i=0; i < args.length; i++) {
				sum = sum + Integer.parseInt (null);
				//sum= 10+ 0
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("One of the command-line" + "arguments is not an integer.");
			System.out.println(nfe);
		}
		
	}


}
