package Copied;

public class Finalizetest {
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
  
	Finalizetest (int a, int b, double c){
		System.out.println(a+" "+b+" "+c);
	}

	
		public static void main(String[] args) {
			TestGarbage obj = new TestGarbage();
			TestGarbage obj1 = new TestGarbage(25, 28);
			Finalizetest obj2 = new Finalizetest(45, 25, 20.3);
			TestGarbage obj3 = new TestGarbage();
			
			obj= null;
			obj3= obj1;
			new TestGarbage();
			obj2= null;
			
			System.gc();
		}
	}

