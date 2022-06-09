package Session2;

public class InnerClass {

	public class Inner{    //Non static inner classes will have only non static method

		public void display() {
			System.out.println("Coming from Inner Class");
		}

	}
	public static class InnerEx{             ////static inner classes will have  static method & Non-static method

		public static void msg() {
			System.out.println("Aman");
		}
	}

}
