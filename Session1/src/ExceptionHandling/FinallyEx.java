package ExceptionHandling;

public class FinallyEx {

	public static void main(String[] args) {
		try {
			System.out.println("first");
			int a= 10/0;
			System.exit(0);  // syste.exit is used to stop finally block execution- jaha execution rokna hai wahi par yeh method lagana hai.
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("Check1");
		}
		finally{
			System.out.println("Finally catched"); // this is always executed. agar system.exit execute hua to finally nahi chalega
		}
	}

}
