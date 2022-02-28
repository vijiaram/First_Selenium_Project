package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myitinerary;

	
	public ConfirmationPage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
