package Collection;

import java.util.*;

public class LInkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.addFirst("123");
		list.addLast("456");
		list.removeLast();
		
		
		
		String u = list.remove(3);
		System.out.println(u);
		
		String b= list.get(2);
		System.out.println(b);
		
		System.out.println(list);

	}

}
