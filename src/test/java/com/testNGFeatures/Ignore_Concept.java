package com.testNGFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void salwar() {
		
		System.out.println("Salwar");

	}
	@Test
	public void saree() {
		System.out.println("Saree");

	}
	@Test
	public void frock() {
		System.out.println("Frock");

	}
	@Test
	public void lehanga() {
		
		System.out.println("Lehanga");

	}
	@Ignore
	@Test
	public void jeans() {
		
		System.out.println("Jeans");

	}
	@Test(enabled = false)
	public void lipstick() {
		
		System.out.println("Lipstick");

	}
	@Test
	public void eyeliner() {
		
		System.out.println("EyeLiner");

	}

}
