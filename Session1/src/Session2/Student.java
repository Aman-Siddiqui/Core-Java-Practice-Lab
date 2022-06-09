package Session2;

public class Student extends Person {

	String dressCode;

	public Student(int id, String name, String dressCode) {
		super(id, name);
		this.dressCode = dressCode;
	}


	// subclass sirf variables la sakta hai parent class. (method lane ke liye super keyword use krte hai)

	public Student() {
		super(5);
	}
	
	
	
	public void msg() {
	
		System.out.println("Id: " +id + "Name: " +name);
		
	}


	public void display() {
		super.msg();              // super keyword parent class ke constructor ko invoke krta hai
		System.out.println("DressCode:"+dressCode+" "+name+"name"+ " "+id+"id");

	}
	

	
	
	
	
	
	
	
	//	
	//	public void display() {
	////		msg();
	//		super.msg();
	//	}
	//	Student(){
	//		super();
	//		System.out.println("coming from Student Class");
	//	}
}
