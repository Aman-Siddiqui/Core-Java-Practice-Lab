package Copied;

public class ThisConstructor {
	
	int h =20;
	ThisConstructorMain obj;      //1. ThisConstructorMain obj = new ThisConstructorMain();
	
	ThisConstructor (ThisConstructorMain a){
		this.obj = a;
	}
	void display() {
		System.out.println(obj.data);
		obj.msg();
		
	}
	
	
	
}

