package Package3;

public class InterfaceClass1 implements Interface, Interface2 {


	public static void main(String[] args) {
		InterfaceClass1 obj = new InterfaceClass1();
		obj.msg();
		Interface.display();
		int y = obj.add();
//		System.out.println(a);
		
	int a = Interface.id;
	System.out.println(a);
	}

	@Override
	public void msg() {
		System.out.println("From Class 1");
		
	}

	@Override
	public int add() {
		System.out.println();
		
		return 2;
		
		
	}

	@Override
	public int multiply() {
		return 0;
	}

}
