package com.automationpractise.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.base.TestMain;

public class LoginPage extends TestMain{
@FindBy(xpath="//a[contains(text(),'Sign in')]")
WebElement Signinbutton;
	@FindBy(xpath="//input[@id ='email']")
	WebElement username;
	@FindBy(xpath="//input[@id ='passwd']")
	WebElement password;
	@FindBy(xpath="//button[@name='SubmitLogin']")
	WebElement Submitbutton;
	
	
 
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
		public MainPage Login(String un, String pwd) {
			Signinbutton.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			username.sendKeys(un);
			password.sendKeys(pwd);
			Submitbutton.click();
			return new MainPage();
			
	}
		
			
		}


	

