package Collection;

import java.util.*;

public class VectorEx { // we can use both interface iterator and enumeration to traverse the element-- it is synchronized-- increases it size by 100%

	public static void main(String[] args) {

		Vector<String> vc = new Vector<>();


		vc.add("Lion");
		vc.add("giraffe");
		vc.add("Tiger");
		vc.add("panthor");
		vc.add("leapord");
		vc.add("Bear");
		vc.add("Bear");
		
//		Iterator<String> itr3 = vc.iterator();
//		
//		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}
		
		Enumeration<String> enm = vc.elements();
		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
