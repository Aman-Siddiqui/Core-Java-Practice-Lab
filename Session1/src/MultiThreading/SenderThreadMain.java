package MultiThreading;

public class SenderThreadMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome!!!");
		Sender sender = new Sender();
		SenderThread t1 = new SenderThread(sender, "Hello");
		SenderThread t2 = new SenderThread(sender, "Welcome");
		SenderThread t3 = new SenderThread(sender, "to");
		SenderThread t4 = new SenderThread(sender, "Java");
		SenderThread t5 = new SenderThread(sender, "Threads");
		
		t2.setName("Aman");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		/*
		 * Thrad : join() causes the main() thread to pause until the last statement of
		 * invoking thread object has completed the execution.
		 * 
		 */
		
		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("End of the program!!!");
		
		System.out.println(t1.isAlive());
		
		
	}

	}


