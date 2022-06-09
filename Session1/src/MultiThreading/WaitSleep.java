package MultiThreading;

public class WaitSleep {

	private static Object obj = new Object();   
	  
  
    public static void main(String[] args) throws InterruptedException   {   
          
        Thread.sleep(2000);   
           
        System.out.println( Thread.currentThread().getName() +  " Thread is woken after two second");   
          
        //create synchronizec context from which we call Wait() method  
        synchronized (obj)    
        {   
            //use wailt() method to set obj in waiting state for two seconds  
            obj.wait(2000);   
  
            System.out.println(obj + " Object is in waiting state and woken after 2 seconds");   
        }   
    }


}