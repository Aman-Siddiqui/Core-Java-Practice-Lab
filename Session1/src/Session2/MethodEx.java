package Session2;

public class MethodEx {

	static int sum;


	int beta= 20;

	int gama=50;

	public  int addition(int a, int b) {
		int sum = a+b;;
		System.out.println(sum);
		return sum;
		

	}
	
   
	public static void main(String[] args) {
		MethodEx obj = new MethodEx();
		obj.addition(20, 40);

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Example(){
      
	}
}

// Static method ko directly class k nam se bula skte , object banane ki zarurat ni hoti..


















//static int sum = 0;
//
//public static void addition(int a,int b ){
//	   sum=a+b;
//}
//
//public static void main(String[] args) {
////    
////		MethodEx obj = new MethodEx();  
//		int result = MethodEx.addition(10, 20);   
//		System.out.println("Result: " + result);