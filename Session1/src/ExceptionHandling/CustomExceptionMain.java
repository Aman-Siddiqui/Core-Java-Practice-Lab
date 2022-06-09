package ExceptionHandling;

import java.util.*;

public class CustomExceptionMain {

	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

	// check the exception condition
	public void checkLanguage(String language) throws CustomException {  // Custom exception classes k liye pehle throws krna hoga phir 
		                                                                 // throw krna hoga tabhi wo exception kam krega

		// throw exception if language already present in ArrayList
		if(languages.contains(language)) {
			throw new CustomException(language + " already exists");  // for in build exception classes , no need to use "throws"
		}
		else {
			// insert language to ArrayList
			languages.add(language);
			System.out.println(language + " is added to the ArrayList");
		}
	}

	public static void main(String[] args) {

		// create object of Main class
		CustomExceptionMain obj = new CustomExceptionMain();

		// exception is handled using try...catch
		try {
			obj.checkLanguage("Swift");
			obj.checkLanguage("Java");
		}

		catch(CustomException e) {
			System.out.println("[" + e + "] Exception Occured");
		}
	}
}




