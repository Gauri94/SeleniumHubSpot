package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	private By header = By.xpath("//div[@class = 'private-header__title private-page__title']");
	
	public WebElement getHeader()
	{
		return getElement(header);
	}
	
	public String getHomePageTitle()
	{
		return getTitle();
	}
	
	public String getHomePageHeader()
	{
		return getPageHeader(header);
	}
	
	
}


