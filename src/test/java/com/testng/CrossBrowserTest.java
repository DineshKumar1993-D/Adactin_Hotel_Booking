package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class CrossBrowserTest extends Base_Class {

	@Parameters({ "browser" })
	@BeforeClass
	public void crossBrowser(String browser) {

		if (browser.equals("chrome")) {

			browserLaunch("chrome");
			
		} else if (browser.equals("edge")) {

			browserLaunch("edge");
		}
	}

	@Test
	private void launchUrl() {

		launchUrl("https://www.facebook.com/login/");

	}

}
