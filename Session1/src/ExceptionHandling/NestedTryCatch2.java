package ExceptionHandling;

public class NestedTryCatch2 {

	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = {1,2,3,4};
					System.out.println(arr[10]);

				}catch (ArithmeticException e1) {
					System.out.println(e1);
					System.out.println("ArithmeticException");
					System.out.println("Inner try block 2");
				}

			}catch (ArithmeticException e2) {
				System.out.println(e2);
				System.out.println("Arithmetic Exception");
				System.out.println("Inner try block 2");

			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("Arithmetic Exception");
				System.out.println("Inner try block 2");
				System.out.println(e);
			}

		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Normal Flow..");

	}

}
