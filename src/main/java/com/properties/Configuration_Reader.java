package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File(
				"C:\\Viji\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p= new Properties();
		p.load(fis);
	}

	public String getURL() throws IOException {

		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {

		String username = p.getProperty("Username");
		return username;
	}
	
	public String getPassword() {

		String password = p.getProperty("Password");
		return password;
	}
	
	public String getLocation() {

		String location = p.getProperty("Location");
		return location;
	}
	public String getHotels() {

		String hotels = p.getProperty("Hotels");
		return hotels;
	}
	
	public String getRoomtype() {

		String roomtype = p.getProperty("Roomtype");
		return roomtype;
	}
	
	public String getRoomnumbers() {

		String roomnumbers = p.getProperty("Roomnumbers");
		return roomnumbers;
	}
	
	public String getDatein() {

		String datein = p.getProperty("Datein");
		return datein;
	}
	
	public String getDateout() {

		String dateout = p.getProperty("Dateout");
		return dateout;
	}
	
	public String getAdult() {

		String adult = p.getProperty("Adult");
		return adult;
	}
	
	public String getChildren() {

		String children = p.getProperty("Children");
		return children;
	}
	
	public String getFirstname() {

		String firstname = p.getProperty("Firstname");
		return firstname;
	}
	
	public String getLastname() {

		String lastname = p.getProperty("Lastname");
		return lastname;
	}
	
	public String getBillingaddress() {

		String billingaddress = p.getProperty("Billingaddress");
		return billingaddress;
	}
	
	public String getCcnumber() {

		String ccnumber = p.getProperty("Ccnumber");
		return ccnumber;
	}
	
	public String getCctype() {

		String cctype = p.getProperty("Cctype");
		return cctype;
	}
	
	public String getCcexpmonth() {

		String ccexpmonth = p.getProperty("Ccexpmonth");
		return ccexpmonth;
	}
	
	public String getCcexpyear() {

		String ccexpyear = p.getProperty("Ccexpyear");
		return ccexpyear;
	}
	
	public String getCccvv() {

		String cccvv = p.getProperty("Cccvv");
		return cccvv;
	}
	
	public String getScreenshotLocation() {

		String screenshotlocation = p.getProperty("ScreenshotLocation");
		return screenshotlocation;
	}
	
	
	
	
	
	

}
