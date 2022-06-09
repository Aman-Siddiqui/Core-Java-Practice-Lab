package AdditionalTopic;

import java.util.function.BiFunction;

public class BiFuncAddThen {

	public static void main(String args[])
	{                                              //apply(int a, int b)
		BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b; //composite1=5

		composite1 = composite1.andThen(c -> 2 * c);  // composite1=5.andThen(result -> 2*result) -its a return type of bifunction andthen() method

		System.out.println(composite1.apply(2, 3));


		BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;

		// Using addThen() method
		composite2 = composite2.andThen(a -> 3 * a);

		// Printing the result
		System.out.println("Composite2 = " + composite2.apply(2, 3));


	}
}