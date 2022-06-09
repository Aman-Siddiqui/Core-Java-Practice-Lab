package Collection;

//import java.util.ArrayList;
import java.util.*;
//The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

//Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

public class List1 { 

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("aa");
		list.add("zz");
		list.add("yy");
		
		
		 Iterator<String> itr = list.iterator();  // ye set ki sare elements utha kr rakh lega   
         

		 while(itr.hasNext()) {      //hasNext() - Returns true if the iteration has more elements. 
			 System.out.println(itr.next());  //next() - Returns the next element in the iteration.
		 }
		
		
//		System.out.println(list.size());
	}
}
//		for(int i=0; i<list.size();  i++) {
//			System.out.println(list.remove(i));
//		}
		
		
		
		
		
		
		//List Interface follow LIFO manner
		//List maintains insertion order. 
		//and it allows duplicates
		
//		String number = list.get(2);
//		
//		String number1 = list.remove(1);
//		list.clear();  		//this method use to clear values from the list

//		
//		int t= list.size();
//		System.out.println(t);
//			
//	
////		System.out.println(list);  
//        System.out.println(number);
//        System.out.println(list);
//        System.out.println(list);
//        
//        if(list.isEmpty()) {    //.isEmpty() is a conditional method
//        	System.out.println("List is Empty");
//        }else{
//        	System.out.println(list);
//        }
//	}

	

//}
