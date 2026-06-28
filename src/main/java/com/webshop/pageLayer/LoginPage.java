package com.webshop.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//------------------Obj repo------------------
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password_txtbox;
	
	@FindBy(xpath="//input[@id='RememberMe']")
	private WebElement Remember_checkbox;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement Login_btn;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	private WebElement EmailText;
	
	//------------------Action methods------------------
	
	public void enterEmail(String email)
	{
		Email_txtbox.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		Password_txtbox.sendKeys(password);
	}
	
	public void clickOnRememberCheckbox()
	{
		Remember_checkbox.click();
	}

	public void clickOnLoginButton()
	{
		Login_btn.click();
	}
	
	public String getEmail()
	{
		return EmailText.getText();
		
	}
}
