package Package3;

public class ConstructorChainingEx {
	String name;
	int phoneNumber;
	String address;
	
	
	public ConstructorChainingEx(String name, int phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public ConstructorChainingEx(int phoneNumber, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public ConstructorChainingEx(String address) {
		super();
		this.address = address;
	}
//	
	


}
