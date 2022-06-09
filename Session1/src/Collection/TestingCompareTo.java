package Collection;

import java.util.*;

public class TestingCompareTo {

	// Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing a TreeMap
        TreeMap<Employee, String> tm = new TreeMap<>();
 
        // Employee object1 (custom input)
        Employee e1 = new Employee(1, "Pathak"); // 1, pathak
 
        // Employee object2 (custom input)
        Employee e2 = new Employee(1, "Pathak");
 
        // Put method associating specific key-value in Map
        tm.put(e1, "First");  //e1 is the key  tm.put((1,"pathak"),value)
        tm.put(e2, "Second");
 
        // Iterating over Map using for-each loop
        // Map with employee key
        for (Map.Entry<Employee, String> e : tm.entrySet())  {
            
            // Print key-value pairs of TreeMap
            System.out.println(e.getKey().id + " "
                               + e.getKey().name + " "
                               + e.getValue());
        }
        
      if(e1.compareTo(e2)==0) {
    	  System.out.println("Its wot");
      }
     

    } 
}
