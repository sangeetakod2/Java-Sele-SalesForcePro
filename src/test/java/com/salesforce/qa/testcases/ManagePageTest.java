package com.salesforce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.HomePage;
import com.salesforce.qa.pages.LoginPage;
import com.salesforce.qa.pages.ManagePage;
import com.salesforce.qa.util.TestUtil;

public class ManagePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ManagePage managePage;
 public ManagePageTest()
 {
	 super();
 }
 
 @BeforeMethod
 public void setUp() throws InterruptedException {
 	intialization();
 	testUtil=new TestUtil();

 	loginPage=new LoginPage();
     homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
      managePage = homePage.clickManageUsersLink();

}
// @Test(priority=1)
// public void verifyManagePageLabelTest() {
//	Assert.assertTrue(managePage.verifyManageUserLable(),"Label is missing");
//	 
// }
 @Test(priority=0)
 public void checkColumnSize() {
	 managePage.selectUserLink();
 }
}