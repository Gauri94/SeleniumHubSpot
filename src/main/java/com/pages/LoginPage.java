package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{	
		super(driver);
	}
	
	// page locators
	
	private By emailId = By.xpath("//input[@id = 'username']");
	private By password = By.xpath("//input[@id = 'password']");
	private By loginButton = By.xpath("//button[@id = 'loginBtn']");
	private By header = By.xpath("//div[@class = 'login.signupLink.text']");
	
	public WebElement getEmailId()
	{
		return getElement(emailId);
	}
	
	public WebElement getPassword()
	{
		return getElement(password);
	}
	
	public WebElement getLoginButton()
	{
		return getElement(loginButton);
	}
	
	public WebElement getHeader()
	{
		return getElement(header);
	}
	
	public String getLoginPageTitle()
	{
		return getTitle();
	}
	
	public String getLoginPageHeader()
	{
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String pwd)
	{
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		return getInstance(HomePage.class);
	}
	
	public void doLogin()
	{
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}
	
	//username: gauri.fab94@gmail.com
	public void doLogin(String userCred)
	{
		if(userCred.contains("username"))
		{
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		else if(userCred.contains("password"))
		{
			getPassword().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
	}

}
