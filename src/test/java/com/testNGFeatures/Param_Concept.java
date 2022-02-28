package com.testNGFeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param_Concept {
	
	
	@Test
	@Parameters({"a" , "b"})
	public void add(int a , int b) {
		
		System.out.println("Add");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
