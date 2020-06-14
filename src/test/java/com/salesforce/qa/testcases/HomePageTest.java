package com.salesforce.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.HomePage;
import com.salesforce.qa.pages.LoginPage;
import com.salesforce.qa.pages.NewUsersPage;
import com.salesforce.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		testutil=new TestUtil();
		loginpage=new LoginPage();
   	    homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public  void varifyNewUserLink() throws InterruptedException
	{
		Thread.sleep(5);
		NewUsersPage newuser = homepage.clickOnNewUserLink();
		
	}
}
