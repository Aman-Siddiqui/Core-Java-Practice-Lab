package Session2;

public class ChainingConstructor {
	
	
	
	ChainingConstructor(){
		this(5);       
		System.out.println("The default Constructor");
	}
	
	ChainingConstructor(int x){
		this(5 , 15);
		System.out.println(x);
	}
	
	ChainingConstructor(int x , int y){
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		new ChainingConstructor();

	}

}
