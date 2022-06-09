package Junit;

public class Varargs {
	
	
	
	static void display(String...values) {   //(...)this is called Variable arguments
		
		for(String s : values) {
			System.out.println(s);
		}
		
		System.out.println("Sample Varargs method");
	}


	public static void main(String[] args) {
		
		display();                             // 0 Argument
		display("I","am","varargs","Method");  // 4 Arguments
		
		//With Varargs Features you can write method that accepts zero or multiple arguments
		

	}

}
