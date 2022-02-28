package com.testNGFeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterixedTest_Concept {
	
	@Test
	@Parameters({"name" , "dept"})
	public void dataEntry(@Optional("Kayal New")String name, String dept){
		
		System.out.println("Name : "+name);
		System.out.println("Department : "+dept);

	}
	
	@Test
	@Parameters({"a" , "b"})
	public void add(int a , int b) {
		
		System.out.println("Add");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}
	@Test
	@Parameters({"a1" , "b1"})
	public void product(int a1 , int b1) {
		
		System.out.println("Product");
		System.out.println("a1 = "+a1);
		System.out.println("b1 = "+b1);

	}

}
