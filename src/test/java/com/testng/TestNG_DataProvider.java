package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class TestNG_DataProvider extends Base_Class {

	public static PageObjectManager pom;

	@BeforeSuite
	public void setUp() {

		browserLaunch("chrome");

	}

	@BeforeClass
	public void setu() {

		launchUrl("https://adactinhotelapp.com/");

	}

	@Test(dataProvider = "test")
	public void login(String username, String password) {

		pom = new PageObjectManager(driver);

		sendValues(pom.getInstanceLogin().getUsername(), username);

		sendValues(pom.getInstanceLogin().getPassword(), password);

		clickOnElement(pom.getInstanceLogin().getLoginBtn());

	}

	@DataProvider(name = "test")
	public Object[][] testdata() {

		return new Object[][] {

				{ "sivaguru", "3848847" }, { "ganesh", "2487368" }, { "balaji", "7473" }, { "Moshina", "32656" },

				{ "Deepeka", "342877" }, { "Abdul", "8744" } };

	}

}
