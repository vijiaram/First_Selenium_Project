package com.testNGFeatures;

import org.testng.annotations.Test;

public class PriorityNInvocationCount {
	
	
	@Test
	public void addMetho() {
		int a=10,b=15;
		int sum = a+b;
		System.out.println("Sum : "+sum);

	}
	@Test(priority=1)
	public void subtractMetho() {
		
		int a=20,b=15;
		int diff = a-b;
		System.out.println("Difference : "+diff);

	}
	@Test(priority=-1, invocationCount = 3)
	public void productMethod() {
		
		int a=10,b=15;
		int prod=a*b;
		System.out.println("Product : "+prod);

	}
	@Test(priority=2)
	public void divideMethod() {
		
		int a=30,b=15;
		int qnt = a/b;
		System.out.println("Quotient :"+qnt);
		

	}

}
