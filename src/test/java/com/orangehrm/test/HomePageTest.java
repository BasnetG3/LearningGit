package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.pages.HomePage;

public class HomePageTest extends BaseTest{
	@Test
	public void logout() {
		HomePage homePage = new HomePage();
		homePage.logoutFromApplication();
		
	}

}
