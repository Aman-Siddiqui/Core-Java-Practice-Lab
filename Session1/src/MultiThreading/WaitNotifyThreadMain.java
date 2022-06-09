package MultiThreading;

public class WaitNotifyThreadMain {

	public static void main(String[] args) throws InterruptedException{
	 
	     WaitNotifyThread t1 = new WaitNotifyThread();
	 
	        t1.start();
	        
	        synchronized (t1) {
	        	
	            System.out.println( "main thread trying to call wait method");
	 
	            // Putting the thread in the waiting state using the wait() method
	            t1.wait();
	 
	            
	            System.out.println("main thread get notify");
	
	            System.out.println(t1.sum);
	        }
	    }
}
