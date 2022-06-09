package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args) {

		SerializationEx obj = new SerializationEx(12, "Aman");

		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\OneDrive\\Java\\aa.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(obj);

			out.close();
			

		} catch (Exception e) {

			e.printStackTrace();
		}
          
		



	}

}
