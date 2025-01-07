package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTest {
	
	//@Test is not required 
	@RepeatedTest(4)
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation Named 2Test");
	}
	
	@RepeatedTest(value = 4, name ="Test 2")
	public void basicTestThird() {
		System.out.println("In Test 3 method @Test Annotation ");
	}
	
	@RepeatedTest(value = 4, name ="Test 1 - repeating {currentRepetition} on {totalRepetitions}")
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation");
	}

}
