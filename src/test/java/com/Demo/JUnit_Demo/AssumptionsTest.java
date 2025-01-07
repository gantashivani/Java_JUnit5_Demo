package com.Demo.JUnit_Demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {

	BasicOperationAssertion boa= new BasicOperationAssertion();
	
	 @Test
	 public  void testAddition() {
	        int num1 = 5;
	        int num2 = 7;
	        assumingThat(num1 > 0 && num2 > 0, () -> {
	            assertEquals(12, boa.add(num1, num2));
	        });
	    }
	 
	 @Test
	 public  void testAdditionAssumeTrue() {
	        int num1 = 2;
	        int num2 = 3;
	        assumeTrue(num1 > 0 && num2 > 0);
	        assertEquals(5, boa.add(num1, num2));
	    }

	 @Test
	 public void testAdditionAssumeFalse() {
	        int num1 = 2;
	        int num2 = 8;
	        assumeFalse(num1 > 0 && num2 > 10);
	        assertEquals(10, boa.add(num1, num2));
	    }
}
