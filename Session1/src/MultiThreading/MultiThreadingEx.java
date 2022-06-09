package MultiThreading;

public class MultiThreadingEx extends Thread{
	
	public  void run(){
		try {
            // Displaying the thread that is running
                                                // object running with ID zero to ....a
//		Thread.sleep(5000);
			 System.out.println(  "Thread " + Thread.currentThread().getId() + " is running");
			 
			
               
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
	}

	public static void main(String[] args) {
		int a = 5; //0-19
		 for(int i=0; i<a; i++) {
			MultiThreadingEx obj = new MultiThreadingEx();
			MultiThreadingEx obj1 = new MultiThreadingEx();
          
		    obj.start();
		    obj1.start();
		}

	}

}
