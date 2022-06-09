package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaderEx {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C:\\Users\\user\\Documents\\java test\\alpha.txt");

			BufferedReader br = new BufferedReader(fr);

			//			int s  = br.read();    
			//			System.out.println(s);
			//			while(s!=0){  
			//			System.out.print("Read: "+s); 
			//			break;
			//			}  
			
			  int i;    
	          while((i=br.read())!=-1){      //   -1 means khaali 
	          System.out.print((char)i);   
	          }
			br.close();    
			fr.close();

	       
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
