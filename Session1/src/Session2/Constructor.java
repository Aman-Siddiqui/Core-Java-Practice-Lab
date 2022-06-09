package Session2;



public class Constructor {

	
	int id;
	String name;

	



//	public Constructor() {
//		System.out.println(" Default Constructor is working");
//	}
	
	
	
	   // paramiterized constructor
	public Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+ " Belongs to " + name);
	
	}
}

