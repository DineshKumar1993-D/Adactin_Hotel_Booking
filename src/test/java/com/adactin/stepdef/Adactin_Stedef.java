package com.adactin.stepdef;

import org.testng.asserts.Assertion;

import com.baseclass.Base_Class;
import com.configuration.Configuration_Reader;
import com.filereader.FileReaderManager;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Stedef extends Base_Class {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^launch The Adactin Url$")
	public void launch_The_Adactin_Url() throws Throwable {

		// launchUrl("https://adactinhotelapp.com/");

//		Configuration_Reader con = new Configuration_Reader();
//		
//		String url = con.getUrl();
//		
//		launchUrl(url);

		String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();

		launchUrl(url);

	}

//	@When("^user Enters The Username In The Inputbox$")
//	public void user_Enters_The_Username_In_The_Inputbox() throws Throwable {
//
//		// sendValues(pom.getInstanceLogin().getUsername(), "Sathish1826");
//
////		Configuration_Reader c = new Configuration_Reader();
////		
////		String username = c.getUsername();
////		
////		sendValues(pom.getInstanceLogin().getUsername(), username);
//
//		String username = FileReaderManager.getInstanceFR().getInstanceCR().getUsername();
//
//		sendValues(pom.getInstanceLogin().getUsername(), username);
//	}
//
//	@When("^user Enters The Password In The Inputbox$")
//	public void user_Enters_The_Password_In_The_Inputbox() throws Throwable {
//
//		// sendValues(pom.getInstanceLogin().getPassword(), "Sathish3456");
//
//		String password = FileReaderManager.getInstanceFR().getInstanceCR().getPassword();
//
//		sendValues(pom.getInstanceLogin().getPassword(), password);
//
//	}
	
	@When("^user Enters The Username\"([^\"]*)\" In The Inputbox$")
	public void user_Enters_The_Username_In_The_Inputbox(String username) throws Throwable {
	  
		
		sendValues(pom.getInstanceLogin().getUsername(), username);
		
		
	}

	@When("^user Enters The Password \"([^\"]*)\"In The Inputbox$")
	public void user_Enters_The_Password_In_The_Inputbox(String password) throws Throwable {
	    
		sendValues(pom.getInstanceLogin().getPassword(), password);
		
	}

	@Then("^user Clicks The Loginbutton and Its Navigates The Search Hotel Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLoginBtn());
	}

}
