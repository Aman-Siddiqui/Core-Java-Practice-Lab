package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrintTest {

//	String message = "Hello World";
	
	Print pr = new Print("Hello World");
	
	@Test 
	public void testPrintMsg () {
		assertEquals("Hello World", Print.printmsg());
	}
}
