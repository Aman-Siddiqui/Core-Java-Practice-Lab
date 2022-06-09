package Package3;

public class A {



	int a;
	String b;
	double c;


	A(){
		a=10; b= "Learn Coding"; c=20.0;

	}

	A(A ref){
		a = ref.a;
		b= ref.b;
	}


	@Override
	public String toString() {     // tostring ke through direct object ki values print kar sakte hai
		return "A [a=" + a + ", b=" + b + ", c=" + c + "]";
	}




}
