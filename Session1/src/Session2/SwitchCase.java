package Session2;

public class SwitchCase {

	public static void main(String[] args) {
		String  a = "Tshirt";
		String size;
		switch (a) {
		case "shirt":
			size = "Higher";
			break;
		case "Tshirt":
			size = "equal";
			break;
		case "pajama":
			size = "smaller";
			break;
       default:
			size = "Invalid";
			break;
		}
		System.out.println(size);
		}

	}
