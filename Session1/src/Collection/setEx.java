package Collection;

import java.util.*;

public class setEx {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();   // it doesn't follow order and doesn't allow duplicate 

		set1.add(600);
		set1.add(50);
		set1.add(7);
		set1.add(8);
		set1.add(5);
		
	


		System.out.println(set1);

		set1.add(71);
		System.out.println(set1);

		Boolean w =set1.contains(81);
		System.out.println(w);

		Integer y = set1.size();
		System.out.println(y);
		
		
	}

}
