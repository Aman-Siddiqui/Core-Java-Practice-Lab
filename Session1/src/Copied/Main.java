package Copied;

public class Main {

	int a=5;

	public static void main(String[] args) {
		Main s1 = new Main();
		s1.p();

	}

	void p() {
		m(this);
	}


	void m(Main obj) {        // s1 transferring its value to obj
		System.out.println(obj);	
	}

	@Override
	public String toString() {
		return "Main [a=" + a + "]";

	}

}
