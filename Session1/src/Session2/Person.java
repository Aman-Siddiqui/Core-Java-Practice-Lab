package Session2;

public class Person {
    
	int id;
	String name;
	
 public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public Person(int id) {
		this.id=id;
		System.out.println(id);
}
	

	public void msg() {
		System.out.println("Id: " +id + "Name: " +name);
	}
	
	public void display() {
		            
		System.out.println("DressCode");

	}
//	
//	Person(){
//		System.out.println("Coming from Person Class");
//	}
}
