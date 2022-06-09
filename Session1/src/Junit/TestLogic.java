package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogic {
	
	Calculation cal = new Calculation();
	
	@Test
	public void testfindmax () {
		
		assertEquals(4,cal.findmax(new int[] {1,3,4,2}));
		assertEquals(-1,cal.findmax(new int[] {-1,-3,-4,-2, -8,-6}));
	}

}
