package Junit;

public class Print {
	
	private static String msg;
	
	Print (String msg){
		this.msg=msg;
	}
	
	public static String printmsg() {
		System.out.println(msg);
		return msg;
	}

}
