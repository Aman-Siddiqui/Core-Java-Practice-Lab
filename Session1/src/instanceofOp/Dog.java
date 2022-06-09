package instanceofOp; // object ki memory class or subclass me hai ya nahi - pata krne k liye.




public class Dog extends Animal {

	public static void main(String[] args) {

		Dog obj = new Dog();  //object are instanceof classes, subclasses
		System.out.println(obj instanceof Animal);

		Dog obj2 = new Dog();
		obj2= null;
		System.out.println(obj2 instanceof Dog);
		
		}
	}
