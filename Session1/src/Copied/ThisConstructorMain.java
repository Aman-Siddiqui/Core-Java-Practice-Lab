package Copied;

public class ThisConstructorMain {

	int data = 10;
	
	ThisConstructorMain(){
		ThisConstructor b = new ThisConstructor(this); // this keyword current class ki object ki info lekar jata hai. object khud nhi jata
		b.display();
	}
	
	public void msg() {
		System.out.println("Charlie");
	}
	public static void main(String[] args) {
		
		ThisConstructorMain aman =new ThisConstructorMain();

	}

}
