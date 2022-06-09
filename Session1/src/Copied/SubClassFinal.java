package Copied;

public class SubClassFinal extends SuperFinal  {

	
	
	public void running() {
		System.out.println("SubClass");
	}

	public static void main(String[] args) {
		SubClassFinal obj = new SubClassFinal();
		obj.run();
		int k= obj.a;
		System.out.println(k);

	}

}
