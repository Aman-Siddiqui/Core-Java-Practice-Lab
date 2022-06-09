package Copied;

public class ThisReturn {

	ThisReturn getA() {   // agar constructor ke andar method use kar rhe hai to return me only this use hota hai. 
		return this;      //or woh this current class ka object return karta hai
	}
	
	void msg() {
		System.out.println("Hello Java");
	}
	
	public int abc(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
public static void main(String[] args) {
		
		ThisReturn  obj=	new ThisReturn();
                   obj.getA().msg();
                obj.abc(2, 3);
              
		
	}

}
