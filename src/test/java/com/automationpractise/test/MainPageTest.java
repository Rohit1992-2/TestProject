package com.automationpractise.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractise.base.TestMain;
import com.automationpractise.qa.LoginPage;
import com.automationpractise.qa.MainPage;

public class MainPageTest extends TestMain {
MainPage mainpage ;


@BeforeMethod 
public void startup() {
	intialization();
	mainpage = new MainPage();
	
}
@Test
public void choose() {
	mainpage.Click();
	
}
@AfterMethod
public void teardown()
{
	driver.quit();}
}