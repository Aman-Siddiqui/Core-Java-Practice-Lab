package MultiThreading;

public class Sender {
	
	public void send(String msg) {
		System.out.println("Sending: "+ msg);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sent : "+msg);
	}
	

}
