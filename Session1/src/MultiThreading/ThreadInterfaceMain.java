package MultiThreading;

public class ThreadInterfaceMain {

	public static void main(String[] args) throws InterruptedException
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new ThreadInterface());
			object.setName("jkjk");
//			object.start();
			object.wait();
			object.start();
			System.out.println(object.isAlive());
			
		}
		
	}
}
