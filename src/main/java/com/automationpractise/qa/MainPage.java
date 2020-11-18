package com.automationpractise.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.base.TestMain;

public class MainPage extends TestMain {
	
	@FindBy(xpath="//a[text()='Women']")
	WebElement Womenbutton;
		@FindBy(xpath="//a[text()='Evening Dresses']")
		WebElement Eveningdress;
		
		
	 
		public MainPage() {
			PageFactory.initElements(driver, this);
			
		}
		Actions as = new Actions(driver);
		
			public CatalogPage Click() {
				as.clickAndHold(Womenbutton).click(Eveningdress);
				
				return new CatalogPage();
}}

	

