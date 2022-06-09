package Package3;

public class AbstractMain extends AbstractEX{

	public static void main(String[] args) {
		AbstractMain obj = new AbstractMain();  
//        AbstractEX obj = new SuperClass();
		obj.msg();   
		
		
		obj.add();
		System.out.println(obj.add());

	}

	@Override
	public int add() {
		System.out.println("Coming from interface");
		
		return 2;
	}

	@Override
	public int multiply() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int msg() {
////		System.out.println("Coming from abstract class examples");
//		return 5;
		
	}

//}
