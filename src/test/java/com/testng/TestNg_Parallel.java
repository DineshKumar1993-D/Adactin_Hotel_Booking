package com.testng;

import org.testng.annotations.Test;

public class TestNg_Parallel {

	@Test
	public void login() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("Adactin");

	}

	@Test
	public void searchLaptop() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Hp");

	}

}
