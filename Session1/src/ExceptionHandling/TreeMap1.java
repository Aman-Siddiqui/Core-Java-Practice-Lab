package ExceptionHandling;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap<String, Integer> tr = new TreeMap<>();
		
		tr.put("aa", 1);
		tr.put("ba", 2);
		tr.put("ca", 3);
		tr.put("da", 4);
		tr.put(null, 5);
		
		System.out.println(tr);  // its gonna throw "runtime exception" --"NullPointerException"
		
		
	}

}
