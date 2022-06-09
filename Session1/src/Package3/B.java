package Package3;

public class B {

	public static void main(String[] args) {
		A r = new A();
	    A r1 = new A(r);
	    A r2 = r1;
		
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
