package Session2;

public class setterGetter {
	
	String name;
	int id;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}





	public static void main(String[] args) {

		setterGetter obj = new setterGetter();
		obj.setName("Charlie");
		obj.setId(5);
		System.out.println(obj.getName());
		System.out.println(obj.getId());


		
		
		
	}

}
