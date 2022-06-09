package Session2;

public class Overloading {
	// method with same name and different data type or different no. of parameters
	
	public void method1(String name){
		System.out.println(name);
	}
   
	public void method1(String address,String name) {
		System.out.println(address + name);
	}
	public static void main(String[] args) {
	    Overloading obj = new Overloading();
	          obj.method1("Aman");
	          obj.method1("address", "name");

	}

}
