package com.wordpressPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcPage_New {

	
	WebDriver driver;

	@FindBy(id="homeval")
	WebElement hValue;
	
	@FindBy(xpath="//*[@id=\"downpayment\"]")
	WebElement dPayment;
	
	
	@FindBy(id="loanamt")
	WebElement loanPayment;
	
	@FindBy(id="intrstsrate")
	WebElement interestRate;
	
	@FindBy(name="cal")
	WebElement buttonCalculate;
	
	@FindBy(xpath="//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")
	WebElement PMI;


	public CalcPage_New(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void CalculatePayment(String homeValue,String downPayment, String loanpay, String iRate)
	{
	    hValue.sendKeys(homeValue);
	    dPayment.sendKeys(downPayment);
	    loanPayment.sendKeys(loanpay);
	    interestRate.sendKeys(iRate);
	    buttonCalculate.click();
	   
	}
	
	public String capturePMI()
	{
		String vPMI = PMI.getText();
		return vPMI;
	}
}
