package Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();

		al.add(new Employee(101,"Vijay",23));  
		al.add(new Employee(106,"Ajay",27));  
		al.add(new Employee(105,"Jai",21));

		System.out.println("Sorting by age");  
		
		

		Collections.sort (al, new AgeComparator());
	
	 

		Iterator itr2=al.iterator();  

		while(itr2.hasNext()){  
			Employee em= (Employee)itr2.next();

			System.out.println(em.id+" "+em.name+" "+em.age);  
		}


	}

}
