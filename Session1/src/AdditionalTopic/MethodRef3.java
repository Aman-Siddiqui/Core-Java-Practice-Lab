package AdditionalTopic;

public class MethodRef3 implements Runnable {

	@Override
	public void run() {
		System.out.println("TEsting");	 	
	} 

	public static void ThreadStatus(){  
		System.out.println("Thread is running...");  
	}  
	public static void main(String[] args) {  


		Runnable ref = MethodRef3::ThreadStatus; //overriding run method again with static method

		ref.run();
	}



}
