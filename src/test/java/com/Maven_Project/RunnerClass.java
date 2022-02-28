package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.BookNowPage;
import com.pomclass.BookedItineryPage;
import com.pomclass.ConfirmationPage;
import com.pomclass.ContinueBookingPage;
import com.pomclass.LoginPage;
import com.pomclass.SearchHotelPage;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class RunnerClass extends BaseClass {

	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {

		implicitwait();
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		// LoginPage
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		sendKeysmethod(pom.getInstanceLogin().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		sendKeysmethod(pom.getInstanceLogin().getPassword(), password);

		clickmethod(pom.getInstanceLogin().getLoginbutton());

		// Search Hotel Page
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		singleDropDown_value(pom.getInstanceSearchpage().getLocation(), location);
		String hotels = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotels();
		singleDropDown_value(pom.getInstanceSearchpage().getHotels(), hotels);
		String roomtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomtype();
		singleDropDown_value(pom.getInstanceSearchpage().getRoomtype(), roomtype);
		String roomnumbers = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomnumbers();
		singleDropDown_value(pom.getInstanceSearchpage().getRoomnumbers(), roomnumbers);
		String datein = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDatein();
		sendKeysmethod(pom.getInstanceSearchpage().getDatein(), datein);
		String dateout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDateout();
		sendKeysmethod(pom.getInstanceSearchpage().getDateout(), dateout);
		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult();
		singleDropDown_value(pom.getInstanceSearchpage().getAdult(), adult);
		String children = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChildren();
		singleDropDown_value(pom.getInstanceSearchpage().getChildren(), children);

		clickmethod(pom.getInstanceSearchpage().getSearchbutton());

		// Continue Booking Page

		clickmethod(pom.getInstanceContinuebooking().getSelectcontinue());

		clickmethod(pom.getInstanceContinuebooking().getContinuesubmit());

		// Book Now Page
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		sendKeysmethod(pom.getInstanceBooknow().getFirstname(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		sendKeysmethod(pom.getInstanceBooknow().getLastname(), lastname);
		String billingaddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBillingaddress();
		sendKeysmethod(pom.getInstanceBooknow().getBillingaddress(), billingaddress);
		String ccnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnumber();
		sendKeysmethod(pom.getInstanceBooknow().getCcnumber(), ccnumber);
		String cctype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCctype();
		singleDropDown_value(pom.getInstanceBooknow().getCctype(), cctype);
		String ccexpmonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcexpmonth();
		singleDropDown_value(pom.getInstanceBooknow().getCcexpmonth(), ccexpmonth);
		String ccexpyear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcexpyear();
		singleDropDown_value(pom.getInstanceBooknow().getCcexpyear(), ccexpyear);
		String cccvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCccvv();
		sendKeysmethod(pom.getInstanceBooknow().getCccvv(), cccvv);

		clickmethod(pom.getInstanceBooknow().getBooknow());

		// Confirmation Page

		clickmethod(pom.getInstanceConfirmation().getMyitinerary());

		// Booked Itinerary Page - Take Screenshot
		String screenshotLocation = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshotLocation();
		methodTakesScreenshot(screenshotLocation);

		clickmethod(pom.getInstanceBookitinery().getLogout());

	}

}
