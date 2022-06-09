package AdditionalTopic;

import java.util.ArrayList;

public class ReduceMethod {

	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList <String>();
		
		list.add("Alpha");
		list.add("Beta");
		list.add("Charlie");
		list.add("Delta");
		list.add("Euro");
		
		String sum = list.stream().reduce(null,    (element1, element2) -> element1+"-"+element2);
		                           //    subtotal,     element            -> subtotal + element
		

		System.out.println(sum);
	}

}
