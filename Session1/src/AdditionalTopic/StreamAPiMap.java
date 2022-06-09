package AdditionalTopic;

public class StreamAPiMap {

		int id;  
	    String name;  
	    float price; 
	    
	    public StreamAPiMap (int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  

	}

		@Override
		public String toString() {
			return "StreamAPiMap [id=" + id + ", name=" + name + ", price=" + price + "]";
		}

}
