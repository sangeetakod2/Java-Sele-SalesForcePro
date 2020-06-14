package com.salesforce.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.util.RepositeriesFactory;
import com.salesforce.qa.util.TestUtil;

public class NewUsersPage extends TestBase{
	
	
	public void createNewUser(String firstname, String lastname, String alias, String email, String user, String nickname, String role) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(RepositeriesFactory.firstName)).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(RepositeriesFactory.firstName)).sendKeys(firstname);
		driver.findElement(By.xpath(RepositeriesFactory.lastName)).sendKeys(lastname);
		driver.findElement(By.xpath(RepositeriesFactory.alias)).sendKeys(alias);
		driver.findElement(By.xpath(RepositeriesFactory.email)).sendKeys(email);
		driver.findElement(By.xpath(RepositeriesFactory.user)).sendKeys(user);
		driver.findElement(By.xpath(RepositeriesFactory.nickName)).sendKeys(nickname);
		
		Select role1 = new Select(driver.findElement(By.xpath(RepositeriesFactory.roleDropDown)));
	    role1.selectByVisibleText(role);
		//String value = role1.getFirstSelectedOption().getText();
		//System.out.println(value);
       // Assert.assertEquals(value, "COO");
        
        driver.findElement(By.xpath("//td[@class='pbButton']//input[@title='Save']")).click();

	}


}
