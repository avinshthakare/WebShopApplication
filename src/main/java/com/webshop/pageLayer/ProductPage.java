package com.webshop.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;



public class ProductPage {
    
    public WebDriver driver;
    
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);     
    }
    
    //--------------------Obj Repo (Anchor Labels)-------------------------
    @FindBy(xpath = "//label[contains(text(),'Processor')]/following::input[contains(@id,'product_attribute')][1]")
    WebElement processor_redio_btn;
    
    @FindBy(xpath = "//label[contains(text(),'RAM')]/following::input[contains(@id,'product_attribute')][1]")
    WebElement ram_redio_btn;
    
    @FindBy(xpath = "//label[contains(text(),'HDD')]/following::input[contains(@id,'product_attribute')][1]")
    WebElement hdd_redio_btn;
    
    @FindBy(xpath = "//label[contains(text(),'Software')]/following::input[contains(@id,'product_attribute')][1]")
    WebElement software_checkbox;
    
    //--------------------Action Methods-------------------
    public void selectMandateDetails()
    {   
    	processor_redio_btn.click();
    	ram_redio_btn.click();
    	hdd_redio_btn.click();
    	software_checkbox.click();
    	
    }
}
