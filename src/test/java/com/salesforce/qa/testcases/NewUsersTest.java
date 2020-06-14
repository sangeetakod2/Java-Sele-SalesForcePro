package com.salesforce.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.HomePage;
import com.salesforce.qa.pages.LoginPage;
import com.salesforce.qa.pages.NewUsersPage;
import com.salesforce.qa.util.TestUtil;

public class NewUsersTest extends TestBase{
	
LoginPage loginPage;
HomePage homePage;
TestUtil testUtil;
NewUsersPage newuserspage;


String sheetName="NewUser";

public NewUsersTest()
{
	super();
	
}

@BeforeMethod
public void setUp() throws InterruptedException {
	intialization();
	testUtil=new TestUtil();

	loginPage=new LoginPage();
    homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    newuserspage=homePage.clickOnNewUserLink();

}

@DataProvider
public Object[][] getNewUserTestData()
{
	Object[][] obj=TestUtil.getTestData(sheetName);
	return obj;
	
}

@Test(dataProvider="getNewUserTestData")
public void validateCreateNewUser(String firstname, String lastname, String alias, String email, String user, String nickname, String role) throws InterruptedException
{
	//homePage.clickOnNewUserLink();

	newuserspage.createNewUser(firstname, lastname, alias, email, user, nickname, role);

}

@AfterMethod
public void tearDown()
{
	driver.quit();

	
}






















}
