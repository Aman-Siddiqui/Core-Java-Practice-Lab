package AdditionalTopic;

public class SayableMain {

	public static void main(String[] args) {

		Sayable s = (name) -> {
			return "Hello "+name;
		};
		System.out.println(s.say("aman"));
		
		Sayable s2 = (name) -> {
			return "Hello "+name;
		};
		System.out.println(s2.say("Charlie"));
		System.out.println(s2.say("Daru"));
		
	}

}
