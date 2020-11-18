package com.automationpractise.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.base.TestMain;

public class CatalogPage extends TestMain {

	
	@FindBy(xpath="//input[@id='layered_id_attribute_group_2']")
	WebElement MSizeCheckbox;
		@FindBy(xpath="//span[@id='layered_price_range']")
		WebElement pricerange;
		@FindBy(xpath="//input[@id ='passwd']")
		WebElement password;
		@FindBy(xpath="//a[@id='color_43']")
		WebElement pinkbutton;
		
		@FindBy(xpath="//button//span[text()='Add to cart']")
		WebElement addtocartbutton;
		
	 
		public CatalogPage() {
			PageFactory.initElements(driver, this);
			
		}
			public PaymentPage Chooseitem() {
				MSizeCheckbox.click();
				pricerange.sendKeys("$50.00 - $52.28");
				pinkbutton.click();
				addtocartbutton.click();
				return new PaymentPage();
				
		}
}
