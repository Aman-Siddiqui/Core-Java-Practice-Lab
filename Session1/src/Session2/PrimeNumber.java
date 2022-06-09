package Session2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 21;
		boolean flag = true;
		
		if(num==1 || num==0) {
			flag = true;
		}
		
		
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {    //29%2==0
				flag =  false;
				break;
			}
		}
		if(flag) {
			System.out.println("Number is a Prime Number");
		}else {
			System.out.println("Number is not a Prime Number");
		}

	}

}


