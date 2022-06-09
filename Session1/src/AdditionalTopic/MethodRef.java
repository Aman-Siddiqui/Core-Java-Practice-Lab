package AdditionalTopic;

public class MethodRef {
	
	public static String SaySomething() {
		System.out.println("This is a Static Method");
		return "Alpha";
	}
	
	public static String SaySomething1() {
		System.out.println("This is a Static Method1");
		return "Alpha";
	}
		public static void main(String[] args) {
			
			MethdRefInter ref = MethodRef::SaySomething;
			MethdRefInter ref1 = MethodRef::SaySomething1;
			
			System.out.println(MethodRef.SaySomething());
			System.out.println(ref.say());
			System.out.println(ref1.say());
		}
	
	

}
