package com.wordpressTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpressPages.CalcPage_New;
import com.wordpressutilites.openBrowser;

public class CalcPayment {
// temp comment
@Test
	
	public  void captureMonthlyPayment() {
		WebDriver driver = openBrowser.openURL("https://www.mortgagecalculator.org/");
		CalcPage_New calc = PageFactory.initElements(driver, CalcPage_New.class);
		calc.CalculatePayment("600000", "100000", "0", "3.75");
		String finalPMI= calc.capturePMI();
		System.out.println(finalPMI);
}
}
