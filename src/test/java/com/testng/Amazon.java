package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	@BeforeSuite
	public void setUp() {
		System.out.println("SetProperty");
	}

	@BeforeTest
	public void browserLaunch() {
		System.out.println("Chrome");
	}

	@BeforeClass
	public void launchUrl() {
		System.out.println("Amazon Url");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test
	public void searchMobile() {
		System.out.println("SAMSUNG");
	}

	@Test
	public void searchLaptop() {
		System.out.println("HP");
	}

	@AfterMethod
	public void verifyMainPage() {
		System.out.println("Assert"); // Actual vs Expected
	}

	@AfterClass
	public void logout() {
		System.out.println("logout");
	}

	@AfterTest
	public void deleteCookies() {
		System.out.println("Delete Cookies");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

}
