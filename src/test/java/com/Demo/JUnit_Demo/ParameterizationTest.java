package com.Demo.JUnit_Demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParameterizationTest {

	@ParameterizedTest @Order(1)
	@ValueSource(strings = {"Java","Programming"})
	public void stringLength(String words) {
		System.out.println("Value Source Parameter " + words.length());
	}
	
	
	@ParameterizedTest @Order(2)
	@NullSource
	public void stringLengthNull(String words) {
		System.out.println("Null Source Parameter");
		//System.out.println(words.length());
		assertTrue(words == null);
	}
	
	@ParameterizedTest @Order(3)
	@EmptySource
	public void stringLengthEmpty(String words) {
		System.out.println("Empty Source Parameter "+ words.length());
		assertTrue(words.isEmpty());
	}
	
	@ParameterizedTest
	@NullAndEmptySource @Order(4)
	public void stringLengthNullEmpty(String words) {
		System.out.println("Empty Null Source Parameter");
		System.out.println(words.length());
		assertTrue(words.isEmpty());
	}
	
	static List<String> dataListStrings(){
			List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
			return list;
	 }
	
	@ParameterizedTest@Order(5)
	@MethodSource("dataListStrings")
	public void listString(String values) {
		System.out.println("Method Source Parametrized "+ values);
	}
	
	
	enum Directions{
		North,South,East,West
	}
	
	@ParameterizedTest@Order(6)
	@EnumSource(Directions.class)
	public void enumSourceTest(Directions direction) {
		System.out.println("Direction "+ direction);
	}
	
	
	@ParameterizedTest@Order(7)
	@CsvSource(value = {
			"qwerty,10",
			"qwerty1,20",
			"qwerty2,30"
	})
	public void csvSourceTest(String name, int age) {
		System.out.println("Name: "+ name+" Age: "+age);
	}
	
	@ParameterizedTest@Order(8)
	@CsvFileSource(resources = "data.csv")
	public void csvFileSourceTest(String name, int age) {
		System.out.println("Name: "+ name+" Age: "+age);
	}
}
