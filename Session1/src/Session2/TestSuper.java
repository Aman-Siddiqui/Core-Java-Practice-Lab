package Session2;

public class TestSuper {

	public static void main(String[] args) {
		Student obj = new Student(20, "Charlie", "Colour");
		obj.display();
	

		Student obj1 = new Student();
	}

}
// parameterized constructor sirf parameterized constructor ke liye chalega
//default constructor sirf default constructor ke liye chalega.

//agar parameterized constructor nahi banaya hai tab default object ko default constructor ki bhi zarurat nahi hai,
//Lekin agar parameterized constructor banaya hai tab default object ko bhi default constructor ki zaroorat hai.