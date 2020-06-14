package com.salesforce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.HomePage;
import com.salesforce.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	static ExtentReports report;
	static ExtentTest logger;


	public LoginPageTest()
	{
		super();

	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage=new LoginPage();
	}

	/*	@Test
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login | Salesforce");
	}

     @Test
     public void logoImageTest()
     {
    	 boolean image=loginpage.validateLogo();
    	 Assert.assertTrue(image);
     }
	 */     
	@Test
	public void loginTest() throws InterruptedException {
		String path="D:\\Report\\TestData\\salesforce\\loginTest1.html";
		report=new ExtentReports(path);
		//logger.log(LogStatus.INFO,"chrome browser is lunched");

		logger=report.startTest("login to SFDC");
		System.out.println("pass:username entered");


		Thread.sleep(3000);
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
		driver.quit();

	}













}
