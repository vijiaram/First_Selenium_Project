package com.testNGFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Ignore
	@Test
	public void login() {
		
		System.out.println("Logged in successfully");

	}
	@Test(dependsOnMethods = "login")
	public void checkEmail() {
		
		
		System.out.println("Check mails");

	}

}
