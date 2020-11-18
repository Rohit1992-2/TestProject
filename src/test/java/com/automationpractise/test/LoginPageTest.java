package com.automationpractise.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractise.base.TestMain;
import com.automationpractise.qa.LoginPage;
import com.automationpractise.qa.MainPage;

public class LoginPageTest extends TestMain {

	LoginPage loginpage;
	MainPage mainpage ;
	
	
LoginPageTest(){
	super();
}
	@BeforeMethod
	public void setup() {
		intialization();
		loginpage = new LoginPage();
		
	}
	@Test 
	public void loginpagetest()
	{
		mainpage =loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}

