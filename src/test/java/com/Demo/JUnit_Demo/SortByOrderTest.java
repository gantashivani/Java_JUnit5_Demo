package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortByOrderTest {

	@Test@Order(1)
	public void basicTestThird() {
		System.out.println("In Test 3 method @Test Annotation Ordered 1");
	}
	@Test@Order(3)
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation Ordered 3");
	}
	
	@Test@Order(2)
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation ordered 2");
	}
}
