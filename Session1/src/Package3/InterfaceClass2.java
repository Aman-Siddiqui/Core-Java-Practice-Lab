package Package3;

public class InterfaceClass2 implements Interface{

	public static void main(String[] args) {
		InterfaceClass2 obj2 = new InterfaceClass2();
		obj2.msg();
		Interface.display();

	}

	@Override
	public void msg() {
		System.out.println("From Class 2 ");
		
	}

	@Override
	public int add() {
		return 1;
		
	}

	@Override
	public int multiply() {
		// TODO Auto-generated method stub
		return 0;
	}

}
