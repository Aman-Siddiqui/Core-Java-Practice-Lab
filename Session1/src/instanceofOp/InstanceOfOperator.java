package instanceofOp;
//object ki memory class or subclass me hai ya nahi - pata krne k liye.

//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass).
//The instanceof in java is also known as type comparison operator because it compares the instance with type. 
//It returns either true or false. If we apply the instanceof operator with any object that has null value, it returns false.

import Copied.Main;

public class InstanceOfOperator {



	public static void main(String[] args) {

		InstanceOfOperator obj = new InstanceOfOperator();
		System.out.println(obj instanceof InstanceOfOperator);
		
		Main obj1 = new Main();
		System.out.println(obj1 instanceof Main);
	}

}
