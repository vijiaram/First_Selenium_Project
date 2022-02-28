package com.testNGFeatures;

import org.testng.annotations.Test;

public class ExpectedException_Concept {
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void printArray() {
		
		int a[]=new int[5];
		
		
		System.out.println(a[6]);

	}
}
