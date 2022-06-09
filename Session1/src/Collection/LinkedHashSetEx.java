package Collection;

import java.util.*;

public class LinkedHashSetEx {
	
	//LinkedHashSet gives insertion, removing, and retrieving operations performance in order O(1). 
	//While TreeSet gives the performance of order O(log(n)) for insertion, removing, and retrieving operations.
	//The performance of HashSet is better when compared to LinkedHashSet and TreeSet.


	public static void main(String[] args) {
	     
		LinkedHashSet<String> set = new LinkedHashSet<>();
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		
		
		 set.add("cat");
		 set.add("dog");
		 set.add("fish");
		 set.add("rabbit");
		 set.add("chicken");
		 set.add("turtle");
		 set.add("dog");
		 set.add("2");
		 set.add(null);  // allows only one
		 set.add(null);
		 
		 set1.add("cat");
		 set1.add("dog");
		 set1.add("fish");
		 set1.add("rabbit");
		 set1.add("chicken");
		 set1.add("turtle");
		 set1.add("dog");
		 set1.add("2");
		 set1.add(null);
		
		 
		
		
		 boolean result = set.equals(set1);
		 
		 System.out.println(result);
		 
		 Iterator<String> itr2 = set.iterator();
		 
		 while(itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
	}

}
