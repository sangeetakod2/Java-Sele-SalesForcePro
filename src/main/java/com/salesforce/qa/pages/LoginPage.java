package com.salesforce.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.util.RepositeriesFactory;

public class LoginPage extends TestBase {

	//page factory
	//Page Factory
	/*@FindBy(name="username")

	WebElement username;

	@FindBy(name="password")
	WebElement password;

	By loginbtn = By.xpath("//input[@value='Login']");*/
	
	By loginbtn=By.xpath("//input[@value='Log In']");

    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    	
    }
    
/*    public String validateLoginPageTitle()
    {
    	return driver.getTitle();
    	
    }
    
    public boolean validateLogo()
    {
    	return salesForceLoginLogo.isDisplayed();
    	
    }
*/    
	public HomePage login(String us, String pass){
		driver.findElement(By.xpath(RepositeriesFactory.username)).sendKeys(us);
		driver.findElement(By.xpath(RepositeriesFactory.password)).sendKeys(pass);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn)).click();

		return new HomePage();
		

	}
	
    
    
    
  
}
