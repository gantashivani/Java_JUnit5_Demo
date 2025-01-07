package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class SkippingTest {
	
	@Test@Disabled
	public void basicTestThird() {
		System.out.println("In Test 2 method @Test Annotation ");
	}
	@Test
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation");
	}
	
	@Test@Disabled("Diabling method test 2 ")
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation ");
	}

}
