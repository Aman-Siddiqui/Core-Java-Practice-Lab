package Collection;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {

		// HashMap <Key, Value> map = new HashMap<>();

		//		HashMap <String, Integer> map = new HashMap<>();
		//
		//		map.put("Aman", 786982048);
		//		map.put("Daru", 786982044);
		//		map.put("Charlie", 786982045);
		//
		//		System.out.println(map.size());
		//		System.out.println(map);

		HashMap <Integer, String> map1 = new HashMap<>();

		map1.put(786982048, "Aman");
		map1.put(786982022, "Daru");
		map1.put(786982045, "Charlie"); // KEY MUST BE UNIQUE-
		map1.put(786982047, "Thomas");  // if the value is same for the same key the previous value will be override 
		map1.put(786982088, "Aman");


		// A map contains values on the basis of key, i.e. key and value pair. 
		// Each key and value pair is known as an entry. A Map contains unique keys.
		// A Map is useful if you have to search, update or delete elements on the basis of a key.          

		//		System.out.println(map1.size());
		//		System.out.println(map1);
		//		
		//		if (map1.containsKey(786982048)) {        // this particular key exist or not  //Searching a value of an entry using key
		//			String value = map1.get(786982048);  // .get() method brings the value of key
		//			System.out.println(value);
		//		}else {
		//			System.out.println("Value not found");
		//		}
		//		
		//		if (map1.containsKey(786982022)) {        
		////			map1.put(786982047, "Sid");           // updating aa value of aa entry using key
		////			map1.put(786982022, map1.get(786982022) + " Ansari");
		//			
		//
		//
		//			System.out.println(map1);
		//		}else {
		//			System.out.println("Value not found");
		//		}	                                                                   // true             //false
		//		                                                                      //  Existing        Non-Existing
		//		map1.put(786982049, map1.containsKey(786982049) ? map1.get(786982049) + "updatedValue" : "NewValue of Newkey"); //Update Operation
		//		
		//		map1.remove(786982088); // removing an entry using key

		//		if(map1.containsKey(786982000)) {
		//			map1.remove(786982000);
		//			System.out.println(map1);
		//		}else {
		//			System.out.println("not found");
		//		}
		//		
		//		System.out.println(map1);
		//		
		Iterator itr = map1.entrySet().iterator();  // iterator using while loop use krte hai ek-ek entry ko print krne k liye 

		while(itr.hasNext()) {
			//			map1.put(123, "Thomas");   // Iterator in HashMap is fail-fast.
			System.out.println(itr.next());
		}

		//   HashMap allows a single null key and multiple null values.
		//		map1.put(786982048, null);
		//		map1.put(null,      null);
		//		map1.put(null,      "as"); 
		//		map1.put(786982047, null);  
		//		map1.put(786982088, null);
		//		
		//		System.out.println(map1);


		HashMap <Integer, String> map3 = new HashMap<>();

//		map3.put(786982048, "Aman");
//		map3.put(786982022, "Dman");
//		map3.put(786982045, "Charlie"); 
//		map3.put(786982047, "Thomas");  
		map3.put(null, null);

		//		if(map1.equals(map3)) {
		//			System.out.println("Same");
		//		}else{
		//			System.out.println("Not same");
		//		}

		//		System.out.println(
		//	            "map1 keys == map3 keys : "
		//	            + map1.keySet().equals(map3.keySet()));

//		System.out.println(map1.get(786982048).compareTo(map3.get(786982022)));

		System.out.println(map3.hashCode()); //It returns the memory reference of the object in integer form. 
		                                     //The value received from the method is used as the bucket number. 
		                                     //The bucket number is the address of the element inside the map. Hash code of null Key is 0.

	}
	
}

              


//file handling, serialization, multithreading, comprarable comparator & exception handling

