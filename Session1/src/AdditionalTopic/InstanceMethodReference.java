package AdditionalTopic;

interface sayable1{
	 void say();  
}

public class InstanceMethodReference {
	
	public void saysomething(){
		System.out.println("This is non-static method");
	}

	public static void main(String[] args) {
		// One Way
		InstanceMethodReference methodref = new InstanceMethodReference();
		
		sayable1 s = methodref::saysomething;
		
		s.say();
		
		// Other way
		sayable1 s1 = new InstanceMethodReference()::saysomething;
		
		s1.say();

	}

}
