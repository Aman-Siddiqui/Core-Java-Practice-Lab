package Copied;

public class TestGarbage {

	int a;
	int b;
	double c;
	
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}

	TestGarbage(){
		System.out.println(a+" "+b);
	}
	
	TestGarbage(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	TestGarbage(int a, int b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public String toString() {
		return "TestGarbage [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public static void main(String[] args) {

		TestGarbage obj = new TestGarbage(25, 28);
		TestGarbage obj1 = new TestGarbage();
		TestGarbage obj2 = new TestGarbage(45, 25, 20.3);

//		obj.msg(25, 28);;
		obj1 = obj;     // by assigning reference of another object
//		obj1 = obj2;
		obj1= null;     // by nulling the reference

		System.out.println(obj);
		System.out.println(obj1);
		
		new TestGarbage();  // by anonymous object

		System.gc();
	}

	

}
