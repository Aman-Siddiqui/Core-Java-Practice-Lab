package Session2;

public class PassByValue {
	
	public int display(int num){
     int num1= num+10;
     return num1;
	}

	public static void main(String[] args) {
		int num1=10;
		PassByValue obj= new PassByValue();
	int z =	obj.display(20);
		
		
		System.out.println(z);

	}

}
