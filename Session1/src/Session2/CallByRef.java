package Session2;

public class CallByRef {

	
	int a = 10;
	public void call(CallByRef cr) {
		cr.a = cr.a+10;
	}
	public static void main(String[] args) {
		
		CallByRef cri = new CallByRef();
		System.out.println("Before Call By Ref "+cri.a);
		
		cri.call(cri);
		System.out.println("After Call By Ref "+cri.a);

	}

}
