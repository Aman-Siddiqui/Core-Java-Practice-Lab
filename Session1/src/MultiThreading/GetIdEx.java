package MultiThreading;

public class GetIdEx extends Thread {
	//Synchronized keyword in Java
	//The process of allowing only a single thread to access the shared data or resource at a particular point of time is known as Synchronization

	
	public synchronized void run()  //without synchronized keyword the threads will collapse
	{  
		System.out.println("running..."); 
		System.out.println("Name of t2: "+Thread.currentThread().getName());
		System.out.println("Id of t2: "+Thread.currentThread().getId());
	}  
	public static void main(String args[])
	{  

		for(int i=0; i<5; i++) {
			// creating one thread
			GetIdEx t2=new GetIdEx(); 
		
			// Returns the identifier of this Thread
			//        System.out.println("Name of t1: "+t2.getName());
			//        System.out.println("Id of t1: "+t2.getId()); 
			// Start the thread 
			t2.start();
		}
	}


}
