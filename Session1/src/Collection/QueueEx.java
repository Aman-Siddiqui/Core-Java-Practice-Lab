package Collection;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
	  // it follows default order and allows duplicate
		
		Queue<String> que = new PriorityQueue<>();

//		que.add(1);
//		que.add(2);
//		que.add(5);                            
//		que.add(3);
//		que.add(6);
//		que.add(4);
//		que.add(1);
		
		que.add("aa");
		que.add("bb");
		que.add("dd");
		que.add("ff");
		que.add("cc");
		
		System.out.println(que);
		System.out.println("Poll Method " + que.poll());

	
		
		System.out.println(que);
		
		
	}

}
