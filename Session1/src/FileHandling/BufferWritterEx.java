package FileHandling;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritterEx {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\java test\\alpha.txt");
			
			BufferedWriter bw= new BufferedWriter(fw); 
			
			bw.write("This is coming from buffer writter");
			
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
