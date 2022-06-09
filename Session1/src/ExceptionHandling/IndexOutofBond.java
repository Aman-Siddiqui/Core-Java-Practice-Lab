package ExceptionHandling;

public class IndexOutofBond {

	public static void main(String[] args) {
		
		int a[] = { 20, 45 ,65, 78 , 96};
		
		try{
			for(int i=0; i<8; i++) {      // its gonna throw "runtime exception" --"ArrayIndexOutOfBoundsException"
		
			System.out.println(a[i]);
		}
		}catch(ArithmeticException e) {
			System.out.println("a");
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("Length is only 5");
		}
	}

}
