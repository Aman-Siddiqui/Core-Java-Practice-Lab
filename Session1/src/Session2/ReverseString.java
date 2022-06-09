package Session2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Madam";
		String empty="";

		//1. Reversing string

		char c[] = name.toCharArray();

//		for (int i=name.length(); i>0; i--) {
//			empty+= c[i-1];
//		}
		
		//Another way of performing for loop in string(without char array)
		for (int i= name.length()-1; i>=0; i--) {
			empty+=name.charAt(i);  // empty= empty+name.charAt(i)
		}
		System.out.println(empty);

		//2. Checking if the string is palindrome

		if((name.toLowerCase()).equals(empty.toLowerCase())){
			// madam                    /madam
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}



	}

}
