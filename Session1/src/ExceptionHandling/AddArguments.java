package ExceptionHandling;

public class AddArguments {


	public static void main(String args[]) {
		try {                           // jisme exception ki sambhavna ho
			int data = 10/0;            // java me koi bi no. 0se divide nhi ho skta
		}catch(ArithmeticException e){  // 
			System.out.println("Access Denied");  // Methamatic related Exception- "" java.lang.ArithmeticException:  ""
			
		}
    System.out.println("a");
	}			 
}
