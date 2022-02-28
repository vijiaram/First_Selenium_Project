package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomnumbers;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement children;
	
	@FindBy(name="Submit")
	private WebElement searchbutton;
		
	public SearchHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumbers() {
		return roomnumbers;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	
}
