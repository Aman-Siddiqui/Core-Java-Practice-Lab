package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {  // time complaxity is O(1)

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		HashSet<String> set1 = new HashSet<>();
		
		
		 set.add("cat");
		 set.add("dog");
		 set.add("fish");
		 set.add("rabbit");
		 set.add("chicken");
		 set.add("turtle");
		 set.add("dog");
		 set.add("2");
		 set.add(null);  // allows only one
		 
		 set1.add("1cat");
		 set1.add("dog");
		 set1.add("fish");
		 set1.add("rabbit");
		 set1.add("chicken");
		 set1.add("turtle");
		 set1.add("dog");
		 set1.add("2");
		 set1.add(null);
		
		
		 boolean result = set.equals(set1);  // .equals() method use for comparing two object values in hashset.
		 
		 
		 System.out.println(result);
		 
		 Iterator<String> itr = set.iterator();  // ye set ki sare elements utha kr rakh lega   
		                                            

		 while(itr.hasNext()) {      //hasNext() - Returns true if the iteration has more elements. 
			 System.out.println(itr.next());  //next() - Returns the next element in the iteration.
		 }

	}

}
