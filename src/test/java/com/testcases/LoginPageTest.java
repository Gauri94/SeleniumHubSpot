package com.testcases;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

import org.testng.Assert;

public class LoginPageTest extends BaseTest{
	
	@Test (priority = 1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test (priority = 2)
	public void verifyLoginPageHeader()
	{
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test 
	public void doLoginTest()
	{
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("gouri.maftest@gmail.com", "Maf@test123");
		String headerHome = homePage.getHomePageHeader();
		Assert.assertEquals(headerHome, "User Guide");
	}

}
