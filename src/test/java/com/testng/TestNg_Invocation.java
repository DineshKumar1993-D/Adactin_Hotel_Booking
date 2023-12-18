package com.testng;

import org.testng.annotations.Test;

public class TestNg_Invocation {

	@Test(expectedExceptions = ArithmeticException.class)
	public void alogin() {

		int a = 5 / 0;
		System.out.println("Facebook");

	}

	@Test(dependsOnMethods = "alogin")
	public void bfbMainPage() {
		System.out.println("User");

	}

	@Test(dependsOnMethods = "bfbMainPage")
	public void csearchFriends() {
		System.out.println("Karthi");

	}

//	@Test(invocationCount = 3)
//	public void log() {
//
//		System.out.println("log");
//
//	}

}
