package com.webshop.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//--------------------Obj Repo-------------------------
	
	 @FindBy(linkText="Shopping cart")
	 WebElement Shopping_cart_link;
	 
	 @FindBy(xpath= "//input[@id='termsofservice']")
	 WebElement termsofservice_checkbox;
	 
	 @FindBy(xpath= "//button[@id='checkout']")
	 WebElement checkout_btn;
	 
	//------------------Action Methods--------------------
	
	 public void clinkOnShoppingcartLink()
	 {
		 Shopping_cart_link.click();		 
	 }
	 
	 
	 public void clinkOnTermsOfServiceCheckbox()
	 {
		 termsofservice_checkbox.click();		 
	 }

	 public void clinkOnCheckoutBotton()
	 {
		 checkout_btn.click();		 
	 }
	 
}
