package Copied;

public class Test {
//	static int i = 10;
//	static int j = 20;
	
	public  int msg(int i, int j) {
		int a = i+j;
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		      int z = obj.msg(5, 6);
		      int y = obj.msg(4, 3);
		    
	}

}

