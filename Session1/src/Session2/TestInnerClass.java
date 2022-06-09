package Session2;

import Session2.InnerClass.Inner;

public class TestInnerClass {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();

		InnerClass.Inner object = obj.new Inner();

		object.display();



		//non-static inner class- object of outer class has to be created and then object of inner class has to be created to call any method

		InnerClass.InnerEx.msg();
		
	}

}
