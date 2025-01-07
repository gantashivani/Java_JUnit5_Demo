package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class SortByDisplayNameTest {
	
	@Test@DisplayName("3Test")
	public void basicTestThird() {
		System.out.println("In Test 3 method @Test Annotation Named 3Test");
	}
	@Test@DisplayName("1Test")
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation Named 1Test");
	}
	
	@Test@DisplayName("2Test")
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation Named 2Test");
	}

}
