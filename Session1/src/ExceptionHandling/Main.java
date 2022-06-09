package ExceptionHandling;

public class Main {
	static void validate (int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Valid");
		}else {
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}catch (InvalidAgeException ex) {
			System.out.println("Caught the Exception");
			System.out.println("Exceptions abc   "+ ex);
		}
		System.out.println("rest of the code...");

	}

}
