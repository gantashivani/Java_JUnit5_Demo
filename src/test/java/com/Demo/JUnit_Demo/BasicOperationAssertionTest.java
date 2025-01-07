package com.Demo.JUnit_Demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicOperationAssertionTest {
	
		BasicOperationAssertion boa= new BasicOperationAssertion();
		
		@Test
		public void testAddTrueCase() {
	       assertEquals(9, boa.add(5,4));
	    }
		
		@ParameterizedTest
		@CsvSource({
			"6,7",
			"8,9"
		})
		public void testAddFalseCase(int a, int b) {
	       assertNotEquals(9, boa.add(a,b));
	    }
		
		
		 @Test
		  public  void testAssertArrayEquals() {
		        int[] expectedArray = {1, 2, 3};
		        int[] actualArray = boa.getArray();
		        assertArrayEquals(expectedArray, actualArray);
		    }
		 
		 @Test
		 public  void testAssertTrue() {
		        assertTrue(boa.isPositive(10));
		    }
	
		   
		  @Test
		  public  void testAssertFalse() {
		        assertFalse(boa.isPositive(-5));
		    }
		
		@Test
		public void testAssertNull() {
		assertNull(null);
		}
		    
		@Test
		public void testAssertNotSame() {
	        String text1 = boa.getHello();
	        String text2 = boa.getHelloString();
	        assertNotSame(text1, text2);
	    }
	
		@Test
	   public void testAssertNotNull() {
	        assertNotNull(boa.getHello());
	    }
	
		
		@Test
	    void testAssertThrows() {
			assertThrows(ArithmeticException.class,()-> boa.throwArithmeticException());
	    }

}
