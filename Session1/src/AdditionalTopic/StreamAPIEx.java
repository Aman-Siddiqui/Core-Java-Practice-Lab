package AdditionalTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(9);
		
		System.out.println(list);
		
		//.stream converts collection object into stream object. - "s" is a streamed object
		
       List<Integer> st = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
          //  Stream s = list.stream();   -collection list ko stream object me convert krta hai
		 // .filter se filter krte hai ex even, odd, <less than,  greater than>,
		//. collect se collected stream objects to new list me store krte hai.
	System.out.println(st);

	}
	

}
