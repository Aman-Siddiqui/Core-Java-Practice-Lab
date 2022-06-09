package ExceptionHandling;

public class StringIndxOOBEx {

	public static void main(String[] args) {

		
		String a = "aman";
		
		for (int i=0; i<5; i++) {            // java.lang.StringIndexOutOfBoundsException: String index out of range: 4
			System.out.println(a.charAt(i));
		}
	
	}
}
