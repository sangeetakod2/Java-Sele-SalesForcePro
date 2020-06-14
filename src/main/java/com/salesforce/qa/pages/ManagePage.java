package com.salesforce.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.util.RepositeriesFactory;

public class ManagePage extends TestBase {

	public boolean verifyManageUserLable() {

		return driver.findElement(By.xpath("//h1[@class='pageType']")).isDisplayed();

	}
	public void selectUserLink() {
		driver.findElement(By.xpath("//a[@id='ManageUsers_font']")).click();
        //METHOD 1 -SELECTING VALUES FROM DYNAMIC WEB TABLE USING FOR LOOP
		
		List<WebElement> col=driver.findElements(By.xpath("//table[contains(@class,'list')]/tbody/tr/th"));
		//System.out.println(col.size());
		List<WebElement> row=driver.findElements(By.xpath("//table[contains(@class,'list')]/tbody/tr/td[1]"));
		//System.out.println(row.size());
		for(int i=1;i<=row.size();i++)
		{
			//selected the alias column value
			String name=driver.findElement(By.xpath("//table[contains(@class,'list')]/tbody/tr["+(i+1)+"]/td[2]")).getText();
			System.out.println(name);
			if(name.contains("tom"))
			{

				driver.findElement(By.xpath("//table[contains(@class,'list')]/tbody/tr["+(i+1)+"]/td[1]/a")).click();
				break;
			}

		}
		
		//METHOD 2 --SELECTING VALUES USING XPATH FUNCTIONS LIKE ANCESTORS
		
        driver.findElement(By.xpath("//a[contains(text(),'tom')]/parent::td//preceding-sibling::td/a")).click();
		driver.findElement(By.xpath(RepositeriesFactory.lastName)).clear();
		driver.findElement(By.xpath(RepositeriesFactory.lastName)).sendKeys("tommy");
        driver.findElement(By.xpath("//td[@class='pbButton']//input[@title='Save']")).click();
		
	}
}
