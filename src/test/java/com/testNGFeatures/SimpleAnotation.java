package com.testNGFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAnotation {
	
	
	@BeforeClass
	public void openApp() {
		
		System.out.println("Open the Calculator Application");

	}
	
	@BeforeMethod
	public void calcStart() {
		
		System.out.println("Start Calculating");

	}
	
	@Test
	public void addMetho() {
		int a=10,b=15;
		int sum = a+b;
		System.out.println("Sum : "+sum);

	}
	@Test
	public void subtractMetho() {
		
		int a=20,b=15;
		int diff = a-b;
		System.out.println("Difference : "+diff);

	}
	@Test
	public void productMethod() {
		
		int a=10,b=15;
		int prod=a*b;
		System.out.println("Product : "+prod);

	}
	@Test
	public void divideMethod() {
		
		int a=30,b=15;
		int qnt = a/b;
		System.out.println("Quotient :"+qnt);
		

	}
	@AfterMethod
	public void calcStop() {
		
		System.out.println("End of Calculation");

	}
	
	@AfterClass
	public void verifyResult() {
		
		System.out.println("Verify the result");

	}
	
	@AfterTest
	public void anotherOperation() {
		
		System.out.println("Do another Calculation");

	}
	
	@AfterSuite
	public void closeApp() {
		
		System.out.println("Close the Application");

	}
	

}
