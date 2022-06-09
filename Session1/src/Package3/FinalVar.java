package Package3;

public class FinalVar {
	final int a;
	int b;

	FinalVar(int a){
		this.a = a;
//		System.out.println(a);
	}
	FinalVar(int a, int b){
		this.a=a;
		this.b=b;
//		System.out.println(a+" "+b);
	}


	@Override
	public String toString() {
		return "FinalVar [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		FinalVar obj = new  FinalVar(10);
		FinalVar obj1 = new  FinalVar(18 , 20);
		
		System.out.println(obj);
		System.out.println(obj1);
		



	}

}
