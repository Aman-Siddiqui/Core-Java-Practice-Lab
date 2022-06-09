package AdditionalTopic;

public class AddableMain {

	public static void main(String[] args) {
		
		Addable ad1 = (int a, int b) -> {
			int sum = a+b;
			return sum;
			
		};
		
		int result = ad1.add(20, 40);
		
		System.out.println(result);
		
		Addable ad2 = (int a, int b) -> {
			return a*b;
		};
		System.out.println(ad2.add(50, 100));
	}

}
