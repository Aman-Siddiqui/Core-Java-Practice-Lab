package Session2;

public class StaticPractice {

	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.

	public StaticPractice(){
		//Constructor incrementing static variable b
		a++; //1 //1
		b++; //1 //2 //3
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
	
	public static void main(String args[]){
		
		StaticPractice s1 = new StaticPractice();

		StaticPractice s2 = new StaticPractice();

		StaticPractice s3 = new StaticPractice();

		StaticPractice s4 = new StaticPractice();


	  }

}
