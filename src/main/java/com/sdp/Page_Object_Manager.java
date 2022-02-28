package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.BookNowPage;
import com.pomclass.BookedItineryPage;
import com.pomclass.ConfirmationPage;
import com.pomclass.ContinueBookingPage;
import com.pomclass.LoginPage;
import com.pomclass.SearchHotelPage;

public class Page_Object_Manager {

	public WebDriver driver;

	private LoginPage login;
	private SearchHotelPage searchpage;
	private ContinueBookingPage continuebooking;
	private BookNowPage booknow;
	private ConfirmationPage confirmation;
	private BookedItineryPage bookitinery;

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public LoginPage getInstanceLogin() {

		if (login == null) {

			login = new LoginPage(driver);

		}
		return login;

	}

	public SearchHotelPage getInstanceSearchpage() {

		if (searchpage == null) {

			searchpage = new SearchHotelPage(driver);

		}
		return searchpage;

	}

	public ContinueBookingPage getInstanceContinuebooking() {

		if (continuebooking == null) {

			continuebooking = new ContinueBookingPage(driver);

		}
		return continuebooking;

	}

	public BookNowPage getInstanceBooknow() {

		if (booknow == null) {

			booknow = new BookNowPage(driver);

		}
		return booknow;

	}

	public ConfirmationPage getInstanceConfirmation() {

		if (confirmation == null) {

			confirmation = new ConfirmationPage(driver);

		}
		return confirmation;

	}

	public BookedItineryPage getInstanceBookitinery() {

		if (bookitinery == null) {

			bookitinery = new BookedItineryPage(driver);

		}
		return bookitinery;

	}

}
