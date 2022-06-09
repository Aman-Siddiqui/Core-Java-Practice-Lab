package Copied;

class SuperFinal {

	final int a=10;



	final void run () {

		System.out.println(a);
	}
	

	public static void main(String[] args) {
		SuperFinal obj1 = new SuperFinal();
		obj1.run();
		final int a;
		a=20;
		System.out.println(a);

	}
}