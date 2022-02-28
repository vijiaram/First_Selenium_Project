package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNowPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement billingaddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccnumber;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccexpmonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccexpyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cccvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	public BookNowPage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	
	

}
