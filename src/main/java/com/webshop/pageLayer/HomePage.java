package com.webshop.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this); 	  
	 }
//-------------Object Repo----------------------
	 
	 @FindBy(xpath ="//a[@class='ico-login']")
	 private WebElement Login_Link;
	 
	 
 //------------Action Repo------------------------
	 
	 public void clickOnLoginLink()
	 {
		 Login_Link.click();  
	 }
}
