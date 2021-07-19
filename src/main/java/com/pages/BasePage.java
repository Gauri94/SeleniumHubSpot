package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{
	
	static Logger logger = Logger.getLogger(BasePage.class);

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try
		{
			element = driver.findElement(locator);
		}
		catch(Exception e)
		{
			logger.info("Some error occurred while creating element " +locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try
		{
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}
		catch(Exception e)
		{
			logger.info("Some error occurred while waiting for the element " +locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			logger.info("Some error occurred while waiting for the title" +title);
			e.printStackTrace();
		}
		
	}

}
