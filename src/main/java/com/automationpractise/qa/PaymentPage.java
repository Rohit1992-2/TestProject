package com.automationpractise.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.base.TestMain;

public class PaymentPage extends TestMain {

	@FindBy(xpath="//span[@class='ajax_block_products_total']")
	WebElement Dresscost;
		@FindBy(xpath="//span[@class='ajax_cart_shipping_cost']")
		WebElement Shippingcost;
		@FindBy(xpath="//span[@class='ajax_block_cart_total']")
		WebElement Totalcost;
		
		
	 
		public PaymentPage() {
			PageFactory.initElements(driver, this);
			
		}
		
		
	public int Dressvalue() {
		
		String  ab =Dresscost.getText();
		int a =Integer.parseInt(ab);
		return a;}
		
		public int Shippingcost() {
			
			String  b =Shippingcost.getText();
			int bc =Integer.parseInt(b);
			return bc;}
				
			public int Totalcost() {
			String tc =Shippingcost.getText();
			int ac =Integer.parseInt(tc);
			return ac;	
			}
				
}
