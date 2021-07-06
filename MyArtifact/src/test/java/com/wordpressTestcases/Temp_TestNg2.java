package com.wordpressTestcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Temp_TestNg2 {

@BeforeTest
	
	public void beforemytest() {
		System.out.println("This is before test from Temp Class 2");
	}

@DataProvider

public Object[][] mydata1() {
	Object[][] sheet1 = new Object[3][2];
	
	sheet1[0][0] = "uname1";
	sheet1[0][1] = "password1";
	
	sheet1[1][0] = "uname2";
	sheet1[1][1] = "password2";
	
	sheet1[2][0] = "uname3";
	sheet1[2][1] = "password3";
	
	return sheet1;
	
			
}

	@Test(dataProvider="mydata1")

	public void login(String uname, String Password) {
	
	System.out.println("MY data from data provider is " + uname + " " + Password);
	
	
	}

	@Test
	@Parameters({"a","b","c"})
	
	public void mytest2(int x, int y, int z) {
		Assert.assertEquals(x+y, z);
		Reporter.log("Test PASSED");
		System.out.println("This is mytest2 from Temp calss 2");
	}
	
	@AfterTest
	
	public void aftermytest() {
		System.out.println("This is my After Test from Temp calss ");
	}
}
