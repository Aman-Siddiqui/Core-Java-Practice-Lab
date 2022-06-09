package Comparable.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator <Employee> {

	@Override
	public int compare(Employee d, Employee h) {
		
		return d.age - h.age;
		

//		if(e1.age==e2.age) { 
//			return 0;
//		}else if(e1.age>e2.age) {  
//			return 1; 
//		}else {
//			return -1;
//		}


	}

}
