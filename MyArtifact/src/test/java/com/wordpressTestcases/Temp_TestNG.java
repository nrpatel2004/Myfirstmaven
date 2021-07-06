package com.wordpressTestcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Temp_TestNG {

	@BeforeTest
	
	public void beforemytest() {
		System.out.println("This is before test from Temp Class");
	}
	@Test
	
	public void mytest1() {
		System.out.println("This is mytest1 from Temp class");
	}
	
	@Test
	
	public void mytest2() {
		System.out.println("This is mytest2 from Temp calss");
	}
	
	@AfterTest
	
	public void aftermytest() {
		System.out.println("This is my After Test from Temp calss");
	}
}
