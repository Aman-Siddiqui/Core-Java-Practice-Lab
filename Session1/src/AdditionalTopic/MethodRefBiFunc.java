package AdditionalTopic;

import java.util.function.BiFunction;

public class MethodRefBiFunc {
	
	public static String concatinate(String name, String LastName) {
		
		return name+LastName;
	}

	public static void main(String[] args) {

	BiFunction <String, String, String> adder = MethodRefBiFunc::concatinate;
	         // arg1    arg2    returntype
	//BiFunction interface ahs two method apply() and addThen() in which method accept 3 value <arg1, arg2, return type>
	           
	String name1 = adder.apply("Aman", "Sid");
	
	System.out.println(name1);
	}

}
