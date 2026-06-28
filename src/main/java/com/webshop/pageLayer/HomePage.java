package com.webshop.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this); 	  
	 }
//-------------Object Repo----------------------
	 
	 @FindBy(xpath ="//a[@class='ico-login']")
	 private WebElement Login_Link;
	 
	 @FindBy(linkText ="Register")
	 private WebElement Register_link ;
	 
	 @FindBy(xpath ="//input[@id='small-searchterms']")
	 private WebElement Search_txtbox ;
	 
	 @FindBy(xpath ="//input[@value='Add to cart']")
	 private WebElement AddCart_btn ;
	 
 //------------Action Repo------------------------
	 
	 public void clickOnLoginLink()
	 {
		 Login_Link.click();  
	 }
	 public void clickOnRegisterLink()
	 {
		 Register_link.click();  
	 }
	 
	 public void enterAndSearchProduct(String product)
	 {
		 Search_txtbox.sendKeys(product+Keys.ENTER);
	 }
	 
	 public void clickOnAddCartButton()
	 {
		 
		 AddCart_btn.click();
	 }
	 
}
