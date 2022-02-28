package com.testNGFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupingConcept {
	
	
	@Test(groups = "Attire")
	public void salwar() {
		
		System.out.println("Salwar");

	}
	@Test(groups = "Attire")
	public void saree() {
		
		System.out.println("Saree");

	}
	@Test(groups = "Attire")
	public void frock() {
		System.out.println("Frock");

	}
	@Ignore
	@Test(groups = "Attire")
	public void lehanga() {
		
		System.out.println("Lehanga");

	}
	
	@Test(groups = "Attire")
	public void jeans() {
		
		System.out.println("Jeans");

	}
	@Test(groups = "Cosmetics")
	public void lipstick() {
		
		System.out.println("Lipstick");

	}
	@Test
	public void eyeliner() {
		
		System.out.println("EyeLiner");

	}
	@Test(groups = "Cosmetics")
	public void kaajal() {
		
		System.out.println("Kaajal");

	}



}
