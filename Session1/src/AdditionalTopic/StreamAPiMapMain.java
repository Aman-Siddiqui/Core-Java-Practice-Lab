package AdditionalTopic;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPiMapMain {

	public static void main(String[] args) {
		List<StreamAPiMap> productsList = new ArrayList<StreamAPiMap>();  

		// Adding Products  
		productsList.add(new StreamAPiMap(1,"HP Laptop",25000f))     ;  
		productsList.add(new StreamAPiMap(2,"Dell Laptop",30000f))   ;  
		productsList.add(new StreamAPiMap(3,"Lenevo Laptop",28000f)) ;  
		productsList.add(new StreamAPiMap(4,"Sony Laptop",28000f))   ;  
		productsList.add(new StreamAPiMap(5,"Apple Laptop",90000f))  ;  

		// Converting product List into Set 

		List<StreamAPiMap> st = productsList.stream().filter(i -> i.price<30000).collect(Collectors.toList());
		
		st.forEach(i->System.out.println(i));
		
		List<Float> st1 =  productsList.stream().filter(i -> i.price<30000).map(j -> j.price).collect(Collectors.toList());

		st1.forEach(i->System.out.println(i));
		
		

			Set<Float> productPriceList =   
						productsList.stream()  
						.filter(i -> i.price < 30000)   // filter product on the base of price  
						.map(j -> j.price)  
						.collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
				
				System.out.println(productPriceList);  
				
				productPriceList.forEach(i->System.out.println(i));

	}


}


