package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {  // follow alphabetic insertion order, dont allow duplicate -- Time Complexity is O log(n).

	public static void main(String[] args) {
	    
		TreeSet<String> tset = new TreeSet<>();
		TreeSet<String> tset1 = new TreeSet<>();
		
		 tset.add("zebra");
	     tset.add("cat");
		 tset.add("dog");
		 tset.add("fish");
		 tset.add("rabbit");
		 tset.add("chicken");
		 tset.add("turtle");
		 tset.add("dog");
         tset.add("2");
//		 tset.add(null);  // runtime error- we cannot add null value- it shows (NullPointerException)
		 
		 tset1.add("zebra");
	     tset1.add("cat");
		 tset1.add("dog");
		 tset1.add("fish");
		 tset1.add("rabbit");
		 tset1.add("chicken");
		 tset1.add("turtle");
		 tset1.add("dog");
         tset1.add("2");
		 
		 
		 boolean result = tset.equals(tset1);
		

		 System.out.println(result);
		 
		 Iterator<String> itr1 = tset.descendingIterator(); // it sorts the elements in reverse alphabetic order
		 
		 while(itr1.hasNext()) {
		 System.out.println(itr1.next());
		 }
	}

}
