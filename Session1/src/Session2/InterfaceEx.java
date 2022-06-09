package Session2;

public class InterfaceEx implements InterfaceExample {

	public static void main(String[] args) {
		InterfaceEx obj = new InterfaceEx();
		int c = obj.msg(2, 5);
		System.out.println(c);
	}

	@Override  
	public int msg(int a , int b){
		int d = a+b;
		System.out.println(d);
		return 2;
	}

	

}
