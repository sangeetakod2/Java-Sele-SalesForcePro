package com.salesforce.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.util.RepositeriesFactory;
import com.salesforce.qa.util.TestUtil;

public class HomePage extends TestBase{

	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public ManagePage clickManageUsersLink() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(RepositeriesFactory.manageUsers)))).click();
		
		
		return new ManagePage();
	}
	public NewUsersPage clickOnNewUserLink() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(RepositeriesFactory.newUser)).click();
		return new NewUsersPage();
	}
}
