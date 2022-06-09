package MultiThreading;

public class ThreadSleepEx extends Thread{

	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(2000);   //Thread.sleep() this method always under try catch
				System.out.println(i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadSleepEx tobj = new ThreadSleepEx();
		tobj.start();
		

	}

}
