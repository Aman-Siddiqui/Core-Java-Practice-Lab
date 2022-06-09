package AdditionalTopic;

public class MethodReferenceCons {

	  public static void ThreadStatus(){  
	        System.out.println("Thread is running...");  
	    }  
	  
	  
	    public static void main(String[] args) {  
	    	//Runnable ref = MethodRefRunnable::ThreadStatus();
	       // Thread t2=new Thread(ref);
	    	
	        Thread t2=new Thread(MethodReferenceCons::ThreadStatus);  
	        
	        
	        t2.start();  // invoking run method of Runnable Interface     
	    }  
	}  


