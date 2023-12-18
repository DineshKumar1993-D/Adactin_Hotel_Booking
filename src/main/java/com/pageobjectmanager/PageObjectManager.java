package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Login;

public class PageObjectManager {

	// 1. Declare the object as private
	// 2. Generate getters
	// 3. Inside the constructor initialize the objects and elements

	WebDriver driver;

	private Login login;

	public Login getInstanceLogin() {

		login = new Login(driver);

		return login;
	}

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, this);

	}

}
