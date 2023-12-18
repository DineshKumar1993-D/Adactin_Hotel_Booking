package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_Ignore {

	@Ignore // Way 1
	@Test
	public void login() {

		System.out.println("Adactin");

	}

	@Test(enabled = false)  //way 2
	public void hotelSelect() {

		System.out.println("Ikon");

	}

	@Test
	public void hotelBooking() {

		System.out.println("Price");

	}

}
