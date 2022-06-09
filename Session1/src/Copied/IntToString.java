package Copied;

public class IntToString {

	public static void main(String[] args) {

		// Method 1:- any premetive data type(except string) into string 
		int a= 10;          
		String str = Integer.toString(a);
		System.out.println(str);

		// Method 2:- any premetive data type into string 
		boolean b= true;
		String str1 = String.valueOf(b);
		System.out.println(str1);
		
       // Integer obj into String object -- Object to Object
		int c= 10;
		Integer obj = new Integer(c);     // Integer obj = int c
		System.out.println(obj);
		String str2 = obj.toString();
		
		//Method 3= String to int Conversion
		String d = "200";      
		int str3 = Integer.parseInt(d);

		System.out.println(d);

	}

}
