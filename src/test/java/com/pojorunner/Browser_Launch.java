package com.pojorunner;

import org.openqa.selenium.WebDriver;

import com.pom.Login;

import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

import com.pojorunner.*;

public class Browser_Launch extends Base_Class {

	public static WebDriver driver;

	public static void browser() {

		browserLaunch("chrome");

		launchUrl("https://www.facebook.com/login/");

		Login log = new Login(driver);

		sendValues(log.getUsername(), "dinesh145@gmail.com");

		sendValues(log.getPassword(), "48894jdjfjdf");

		clickOnElement(log.getLoginBtn());

	}

	public static void main(String[] args) {

		browser();
	}

}
