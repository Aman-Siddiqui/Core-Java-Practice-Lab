package AdditionalTopic;

@FunctionalInterface
public interface FuncInterfaceEx { // the Interface which has only and only one abstract method is called functional interface
	
	public void draw();
	
	public static  int abc(){
		System.out.println("This is Static Method");
		return 5;
	}

}
