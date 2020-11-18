package com.automationpractise.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractise.base.TestMain;
import com.automationpractise.qa.CatalogPage;
import com.automationpractise.qa.LoginPage;
import com.automationpractise.qa.PaymentPage;

public class CatalogPageTest extends TestMain {

	CatalogPage catalogpage ;
	PaymentPage paymentpage;

	@BeforeMethod
	public void setup() {
		intialization();
		catalogpage = new CatalogPage();
		
	
}
	@Test
	public void chooseitem () {
		paymentpage = catalogpage.Chooseitem();
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}
