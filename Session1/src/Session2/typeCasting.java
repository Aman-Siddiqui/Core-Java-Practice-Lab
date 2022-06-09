package Session2;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//implicit casting( smaller to bigger)
		
				int i=100;
				long a=i; // long a=100l;
				float b=a;
				
				System.out.println("i"+i);
				System.out.println("a"+a);
				System.out.println("b"+b);
				
				//explicit casting(bigger to smaller)
				
				double c=100.054;
				long l=(long)c;
				int j=(int)l;
				
				System.out.println("c "+c);
				System.out.println("l "+l);
				System.out.println("j "+j);


				// float
				
				float randomNumber = 3234567.123456f;
				
				System.out.println("float "+randomNumber);
				
				//double 
				
				double number = 1234567.23;
				
				System.out.println("result "+number);
			

	}

}
