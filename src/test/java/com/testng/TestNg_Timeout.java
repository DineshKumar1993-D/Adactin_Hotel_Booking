package com.testng;

import org.testng.annotations.Test;

public class TestNg_Timeout {

	@Test(timeOut = 1000)
	public void login() throws InterruptedException {

		Thread.sleep(500);

		System.out.println("Amazon");

	}

	@Test
	public void searchMobile() throws InterruptedException {

		Thread.sleep(1500);

		System.out.println("Sony");
	}

}
