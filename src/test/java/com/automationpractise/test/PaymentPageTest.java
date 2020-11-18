package com.automationpractise.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractise.base.TestMain;
import com.automationpractise.qa.CatalogPage;
import com.automationpractise.qa.LoginPage;
import com.automationpractise.qa.MainPage;
import com.automationpractise.qa.PaymentPage;

public class PaymentPageTest extends TestMain{
PaymentPage paymentpage;
MainPage mainpage;
LoginPage loginpage;
CatalogPage catalogpage;
	public PaymentPageTest() {
	
		super();
		
		
	}
@BeforeMethod 
public void setup() {
	intialization();
	
	paymentpage = new PaymentPage();
mainpage = new MainPage();
loginpage= new LoginPage();
catalogpage = new CatalogPage();
}

@Test
public void chooseitem () {
	paymentpage = catalogpage.Chooseitem();}
public void choose() {
		mainpage.Click();}	
public void loginpagetest() {

	mainpage =loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));}

public void  validatedressval() {
	int dv =paymentpage.Dressvalue();
	
	Assert.assertEquals(dv,"$50.99");
	
	
}

public void  validateshippingval() {
int sv = paymentpage.Shippingcost();
Assert.assertEquals(sv,"$2.00");
	}

public void Totalcost() {
	int tv = paymentpage.Totalcost();
	Assert.assertEquals(tv,"$52.99");
	
}
@AfterMethod 
public void teardown() {
driver.quit();
}
}

