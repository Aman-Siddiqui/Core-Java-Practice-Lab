package MultiThreading;

public class WaitNotifyThread extends Thread{

	int sum = 0;

	public void run(){

		synchronized (this){   // Calculating the sum

			System.out.println("child thread start calculation");

			// Iterating to calculate the sum
			for (int i = 0; i <= 100; i++) {  // if condition k bad and for loop k bad agar ek hi statement hai to bracket lagana mandate nahi hai.

				sum += i;
			   
			}
			System.out.println("child thread trying to give notification");

			// This keyword refers to current object itself Notifying the current waiting thread using notifyAll() method
			this.notifyAll();
		}
	}

}
