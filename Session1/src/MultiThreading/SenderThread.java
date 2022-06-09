package MultiThreading;

public class SenderThread extends Thread{

	Sender sender;
	String msg;
	
	public SenderThread(Sender sender, String msg) {
		
		this.sender = sender;
		this.msg = msg;
	}
	
	public  void run() {
		System.out.println(Thread.currentThread().getName());
		synchronized (sender) {
			sender.send(msg);
		}
	}
	
	

	

}
