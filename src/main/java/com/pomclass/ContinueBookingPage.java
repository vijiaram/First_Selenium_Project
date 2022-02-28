package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueBookingPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectcontinue;
	
	public ContinueBookingPage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectcontinue() {
		return selectcontinue;
	}

	public WebElement getContinuesubmit() {
		return continuesubmit;
	}

	@FindBy(xpath="//input[@name='continue']")
	private WebElement continuesubmit;

}
