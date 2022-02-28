package com.testNGFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	
	@Test(dataProvider = "inputData")
	public void getCityCode(String city, String code) {

		System.out.println("City : "+city);
		System.out.println("Code : "+code);

	}
	
	@DataProvider
	public Object[][] inputData() {
		
		return new Object[][] {
			
			{"Chennai","044"},
			{"Bangalore","088"},
			{"Mumbai","022"},
			{"Delhi","011"},
			{"Kolkata","033"}
		};

	}
}
