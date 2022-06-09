package Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	static int countOccurences(Hashtable<String, Integer> ht, int value) {
		int count = 0;
		for(String key : ht.keySet()) {
			if(ht.get(key) == value) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("Dubai", 123);
		ht.put("India", 123);
		ht.put("China", 123);
		ht.put("Japan", 654);
		ht.put("Qatar", 987);


		System.out.println(countOccurences(ht, 123));


		Iterator itr = ht.entrySet().iterator();  // iterator using while loop use krte hai ek-ek entry ko print krne k liye 

		while(itr.hasNext()) {
			//			ht.put("a", 2);    //Iterator in HashMap is fail-fast.
			System.out.println(itr.next());		
		}



		Enumeration e = ht.elements();

		// Condition holds true till there is
		// single key remaining

		// Printing elements of hashtable
		// using enumeration
		while (e.hasMoreElements()) {

			ht.put("a", 2);  // Enumerator in Hashtable is not fail-fast.

			// Printing the current element
			System.out.println(e.nextElement());


		}
		System.out.println(ht);



	}



}
