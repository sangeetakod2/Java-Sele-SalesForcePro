package com.salesforce.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositeriesFactory {

	public static By byUsernameTextboxID = By.id("username");
	//@FindBy(name="username")
	public static String username = "//input[@name='username']";
	//@FindBy(name="pw")
	public static String password = "//input[@id='password']";
	public static String salesForceLoginLogo="//img[@name='logo']";
	//HomePage
	public static String newUser="//a[@title='New user']";
	public static String firstName="//input[@id='name_firstName']";
	public static String lastName="//input[@id='name_lastName']";
	public static String alias="//input[@id='Alias']";
	public static String email="//input[@id='Email']";
	public static String user="//input[@id='Username']";
	public static String nickName="//input[@id='CommunityNickname']";
	public static String roleDropDown="//select[@id='role']";

	public static String userLicense="//select[@id='user_license_id']";
	public static String userProfile="//select[@id='Profile']";
	public static String emailCoding="//select[@id='EmailEncodingKey']";
    public static String manageUsers="//a[contains(text(),'Manage Users')]";

	
    public static String usersLink="//a[@id='ManageUsers_font']";



	

	
}
