package Collection;

import java.util.*;

public class TreeMapEx implements Comparable { // ascending order follow, or



	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {

		TreeMap<String, Integer> tr = new TreeMap<>();

		
		//TreeMap allows homogeneous values as a key because of sorting.
				tr.put("1Honda", 123);
				tr.put("Suzuki", 456);
				tr.put("2Hero", 678);
				tr.put("Amaha", 123);
				
			
				TreeMap<String, Integer> tr1 = new TreeMap<>();
				
				tr1.put("1Honda", 123);
				tr1.put("Suzuki", 456);
				tr1.put("2Hero", 678);
				tr1.put("Amaha", 123);
				
			
			


//		TreeMap<Integer, String> tr1 = new TreeMap<>();
//
//		tr1.put(0123, "Honda");
//		tr1.put(456, "Suzuki");
//		tr1.put(789, "Hero" );
//		tr1.put(523, "Yamaha");
//
//
//		for (Map.Entry map1 : tr1.entrySet()) {  //Map.Entry is an inbuilt interface
//			int key = (int)map1.getKey();     // (int)- ye Integer ko int me convert kar rha hai...Explicit casting
//
//			// Adding some bonus marks to all the students
//			String value = (String)map1.getValue();  // (String)- ye Integer ko int me convert kar rha hai...Explicit casting
//
//			// Printing above marks corresponding to
//			// students names
//			System.out.println(key + " : " + value);
		}



		// For loop - tried
		//		TreeMap<Integer, String> tr2 = new TreeMap<>();
		//
		//		tr2.put(123, "Honda");
		//		tr2.put(456, "Suzuki");
		//		tr2.put(789, "Hero" );
		//		tr2.put(523, "Yamaha");
		//		
		//		for(int i=0;  i<tr2.size();) {
		//			System.out.println(tr2.ceilingEntry(i));
		//			i++;
		//		}



//		// TreeMap does not allow null keys but can have multiple null values.
//		TreeMap<Integer, String> tr2 = new TreeMap<>();
//
//		tr2.put(123, null);
//		tr2.put(456, null);
//		tr2.put(789, null );
//		tr2.put(523, null);
//
//
//		System.out.println(tr2);


	

	}


