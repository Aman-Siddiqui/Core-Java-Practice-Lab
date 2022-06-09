package MultiThreading;

public class TestSleepThread extends Thread {



	public synchronized void run(){  
		
		for(int i=1;  i<5;  i++){   
			// the thread will sleep for the 500 milliseconds   
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}    
			System.out.println(i);    
		}    
	}    
	public static void main(String args[]){   

		TestSleepThread t1=new TestSleepThread();    
		TestSleepThread t2=new TestSleepThread();    

		t1.start();    
		t2.start();    
	}


}


