package MultiThreading;

public class ThreadInterface implements Runnable {

	@Override
	public void run() {
		{
	        try {
	            // Displaying the thread that is running
	        	
	            System.out.println( "Thread " + Thread.currentThread().getName()+Thread.currentThread().getId() + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
		
	}

}
