package com.wordpressTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wordpressPages.CalcPage_New;
import com.wordpressutilites.openBrowser;

public class CalcPayment {
// temp comment
@BeforeTest
	public void beforetest() 
		{
		   System.out.println("This is before test");
		}
@Test (priority=2)
	
	public  void captureMonthlyPayment() {
		WebDriver driver = openBrowser.openURL("https://www.mortgagecalculator.org/");
		CalcPage_New calc = PageFactory.initElements(driver, CalcPage_New.class);
		calc.CalculatePayment("600000", "100000", "0", "3.75");
		String finalPMI= calc.capturePMI();
		System.out.println(finalPMI);
}
@Test (priority=1)

   public void secondtest()
   {
	System.out.println("This is my second test");
   }

@Test (priority=3, enabled=false)

public void Thirdtest()
{
  System.out.println("This is my second test");
  String a = "abc";
  String b = "abc";
  Assert.assertEquals(a, b);
}


@AfterTest

   public void myaftertest() {
	 System.out.println("This is my after Test");
}
   
		


}
