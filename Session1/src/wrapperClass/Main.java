package wrapperClass;

public class Main extends Animal {
	
	static void method(Animal b) {             //Animal b= a  // implicit (ref var) to object
		if (b instanceof Main) {
			Main c = (Main)b;                                 // explicit  object to (ref var)
			
			System.out.println("ok Dc");
		}
		
	}

	public static void main(String[] args) {
		
          Animal a = new Main();
          Main.method(a);
		
	}

}
