package Session2;

public class ConstructorMain {

	public static void main(String[] args) {
		
		
//		Constructor            cons        =      new                         Constructor();
// ye class ka nam hai     object name hai       memory location/ state      constructor name because iske aage brackets hai.

		                                  //id,  name
		Constructor cons1 = new Constructor(1, "Aman");
		Constructor cons2 = new Constructor(2, "Shejo");
		
		System.out.println(cons1);
		
		cons1.display();
		
		
		System.out.println("anything");
	}

}
