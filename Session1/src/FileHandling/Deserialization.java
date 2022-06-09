package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fout1 = new FileInputStream("C:\\Users\\user\\OneDrive\\Java\\ff.txt");
			
			ObjectInputStream out1 = new ObjectInputStream(fout1);
			
			SerializationEx obj1= (SerializationEx)out1.readObject();
			
			System.out.println(obj1);
//			System.out.println(obj1.id+obj1.name);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
