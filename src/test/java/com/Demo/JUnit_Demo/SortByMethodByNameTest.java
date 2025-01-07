package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SortByMethodByNameTest {
	
	@Test
	public void basicTestThird() {
		System.out.println("In Test 3 method @Test Annotation");
	}
	@Test
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation");
	}
	
	@Test
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation");
	}

}
