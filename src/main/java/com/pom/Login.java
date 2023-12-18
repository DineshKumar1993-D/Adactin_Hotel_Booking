package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// 1.Declare the element as private by using
	// @FindBy() annotation
	// 2.Generate getters
	// 3.Inside the constructor, we intialize the elements
	// by using PageFactory.initElements()

	public WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getUsername () {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public Login(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, this);
	}
}
