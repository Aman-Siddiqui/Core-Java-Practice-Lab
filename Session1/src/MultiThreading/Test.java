package MultiThreading;

public class Test {
	
	//  deadlock--Part of multi-threading, in this 2 objects are waiting for each other to complete the process and exit

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {

		Thread T1 = new Thread1();
		Thread T2 = new Thread2();

		T1.start();
		T2.start();

	}
	private static class Thread1 extends Thread {

		public  void run () {

			synchronized(lock1) {
				System.out.println("Thread1 : Hold Lock1");
				try {
					Thread.sleep(-2000);

				} catch (Exception e) {
					System.out.println("Thread1 waiting Lock2");

					synchronized(lock2) {
						System.out.println("Thread 1: Hold lock 1 & 2");
					}
				}
			}


		}
	}

	private static class Thread2 extends Thread {

		public  void run () {

			synchronized(lock2) {
				System.out.println("Thread2 : Hold Lock2");
				try {
					Thread.sleep(2000);

				} catch (InterruptedException e) {
					System.out.println("Thread2 waiting Lock1");

					synchronized(lock1) {
						System.out.println("Thread 2: Hold lock 1 & 2");
					}
				}
			}


		}
	}





}




