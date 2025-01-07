package com.Demo.JUnit_Demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitAnnotationsTest {
	
	@Test
	public void basicTest() {
		System.out.println("In Test 1 method @Test Annotation");
	}
	
	@Test
	public void basicTestSecond() {
		System.out.println("In Test 2 method @Test Annotation");
	}
	
	
	//@BeforeAll is used only with static method 
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("Using BeforeAll annoation for this method");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("BeforeEach method annotation in this method");
	}
	
	//@AfterAll is used only with static method
	@AfterAll
	public static void afterAllTest() {
		System.out.println("AfterEach method annotation in this method");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("AfterAll method annotation method");
	}
}
