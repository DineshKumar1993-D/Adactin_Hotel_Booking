package com.testng;

import org.testng.annotations.Test;

public class TestNg_Group {

	@Test(groups = "A")
	public void login() {

		System.out.println("Facebook");
	}

	@Test(groups = "B")
	public void searchLaptop() {

		System.out.println("Hp");
	}

	@Test(groups = { "A", "B" })
	public void searchBags() {

		System.out.println("Tycoon");
	}

}
