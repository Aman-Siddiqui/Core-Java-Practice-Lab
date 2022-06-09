package Session2;

public class FactorialWIthRecursion {

	public static void main(String[] args) {
		
		int num = 3;
		long factorial = multiplyNumber(num);
		
		System.out.println("Factorial of"+num+"="+factorial);
}
	
	public static long multiplyNumber(int num) {
		
		if(num>=1) {
			return num* multiplyNumber(num-1);
		}else {
			return 1;
		}
	}

}

//return 3* multiplyNumber(2);
//return 2* multiplyNumber(1);
//return 1* 1;
