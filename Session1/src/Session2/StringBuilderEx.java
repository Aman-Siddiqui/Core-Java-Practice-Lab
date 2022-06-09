package Session2;

public class StringBuilderEx {

	public static void main(String[] args) {
		
////		StringBuilder obj1 =  new StringBuilder();
//		String name = "Aman";
////		name = obj1.append("Siddiqui");
//	//		System.out.println(obj1.append("Siddiqui"));
//            name = name+obj1.append("Siddiqui");
//            System.out.println(name);
		
      
		StringBuilder obj1 =  new StringBuilder();
		String name = "Aman";
		obj1.reverse();
		System.out.println(obj1);
		
		StringBuilder obj2 =  new StringBuilder("Aman");
		obj2.append("Siddiqui");
		System.out.println(obj2);
		obj2.reverse();
		System.out.println(obj2);
		
	}

}
