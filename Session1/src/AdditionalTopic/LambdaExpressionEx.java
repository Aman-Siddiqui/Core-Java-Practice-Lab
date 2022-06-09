package AdditionalTopic;

public class LambdaExpressionEx { // Lambda Expression functional interface ki abstract method ko override and call krta hai without implementing
	
	public static void main(String[] args) {
		
		int width = 10;
		
		FuncInterfaceEx fi = () -> {                 // lambda Operator "->"
			System.out.println("Interface Method- "+ width);
		};
		
		fi.draw();
		
		FuncInterfaceEx.abc();
		System.out.println(FuncInterfaceEx.abc());
	}

}
