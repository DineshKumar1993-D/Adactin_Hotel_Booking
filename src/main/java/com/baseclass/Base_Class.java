package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		// chrome, CHROME, Chrome
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\Driver119\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void sendValues(WebElement element, String values) {

		element.sendKeys(values);

	}

	public static void closeWindow() {

		driver.close();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void navigateMethod(String method) {

		if (method.equalsIgnoreCase("back")) {

			driver.navigate().back();

		} else if (method.equals("forward")) {

			driver.navigate().forward();

		} else if (method.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();
		}

	}

	public static void printScreen(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\Screenshot\\" + filename + ".png");

		FileUtils.copyFile(source, destination);
	}

//	public static void main(String[] args) throws IOException {
//
//		browserLaunch("edge");
//
//		launchUrl("https://www.facebook.com/");
//
//		printScreen("image1");
//
//		printScreen("image2");
//
//	}

}
