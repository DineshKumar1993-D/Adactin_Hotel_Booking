package com.testng;

import org.testng.annotations.Test;

public class TestNg_Priority {

	@Test(priority = 2)
	public void login() {

		System.out.println("Facebook");
	}

	@Test(priority = -1)
	public void searchMobile() {

		System.out.println("Vivo");
	}

	@Test(priority = 1)
	public void searchLaptop() {

		System.out.println("Hp");
	}

}
