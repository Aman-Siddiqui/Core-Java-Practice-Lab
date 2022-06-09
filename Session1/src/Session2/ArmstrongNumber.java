package Session2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int low = 999, high = 99999;
		for(int number= low; number<high; ++number) {
			if(checkArmstrong(number))
				System.out.println(number+" ");
		}
	}

	public static boolean checkArmstrong(int num) {

		int digits= 0;
		int result= 0;
		int originalNumber= num;

		while(originalNumber !=0) {
			originalNumber/=10; // original number=163. 16, 1, 0
			++digits;            //1,2,3, 4
		}
		originalNumber = num;  //1634

		while(originalNumber!=0) {

			int remainder =  originalNumber%10; //4,3 6, 1
			result+=Math.pow(remainder, digits);  //0+4^4=256, 256+3^4=337 337+6^4=1633 1633+1=1634
			originalNumber/=10;                  //163, 16, 1, 0
		}
		if(result==num) {
			return true;
		}
		return false;
	}

}
