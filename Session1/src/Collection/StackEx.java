package Collection;

import java.util.*;  
//It follow LIFO manner- maintains insertion order - allows duplicate


public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();  // sTACK IS  a class
		
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(15);
		stk.push(14);
		stk.push(10);
//		stk.push(11);
		stk.pop();
		
		
		System.out.println(stk);

	}

}
