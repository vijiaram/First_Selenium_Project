package com.testNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	@Test
	public void openAdactin() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	// LoginPage
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("vijayakumariaram");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("welcome");
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
	
	WebElement welcomenote = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
	String welcometext = welcomenote.getText();
	String expectedtext = "Welcome to Adactin Group of Hotels";
	
	Assert.assertEquals(welcometext, expectedtext);
	System.out.println(welcometext);
	}
}
