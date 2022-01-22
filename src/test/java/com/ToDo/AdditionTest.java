package com.ToDo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Addition addition = new Addition();
		
		int result = addition.add(6,4);
		
		assertEquals(10, result);
		
	}
	
	@Test
	void testNegative() {
		//fail("Not yet implemented");
		
		Addition addition = new Addition();
		
		int result = addition.add(-6,-4);
		
		assertEquals(-10, result);
		
	}


}
