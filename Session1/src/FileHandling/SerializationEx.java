package FileHandling;

import java.io.Serializable;

public class SerializationEx implements Serializable {
	
	private static final long serialVersionUID = -8450388644495776457L;

	int id;
	String name;
	
	SerializationEx(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "SerializationEx [id=" + id + ", name=" + name + "]";
	}
	

}
