package com.testNGFeatures;

import org.testng.annotations.Test;

public class TimeOut_Concept {
	
	
	@Test(timeOut = 4000)
	public void addToCart() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Select Item");
		
		Thread.sleep(2000);
		System.out.println("Add to Cart");
		
		Thread.sleep(3000);
		System.out.println("Do Payment");

	}

}
