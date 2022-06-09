package Package3;

public interface Interface extends Interface2{

	
	// Ek method Different Behaviour is called runtime Polymorphism, joki 2 type ka hota hai... 1-runtime & 2-compiletime
	
	// method overloading is used to achieve - compile time Polymorphism.
	// method overriding is used to achieve -  run time Polymorphism.
	
	static int id= 10;
	
	
	public void msg();
	
	public int add();
	
	public static void display() {
		System.out.println("Charlie");

	}
}
