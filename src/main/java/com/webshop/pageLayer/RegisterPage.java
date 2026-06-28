package com.webshop.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.utilities.RandomFunction;

public class RegisterPage {

	public WebDriver driver;
	
	
	public RegisterPage(WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//---------------Object Repo------------------------
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement Redio_btn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement Fname_txtbox;

	@FindBy(xpath="//input[@id='LastName']")
	private WebElement Lname_txtbox;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password_txtbox;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement ConfirmPassword_txtbox;
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement Register_btn;
	@FindBy(xpath="//div[@class = 'result']")
	private WebElement Registation_text;
	
	
	
	
	//---------------Action Repo------------------------
	
	
	public void enterDeatails()
	{
		RandomFunction obj_rndm = new RandomFunction();
		
		Redio_btn.click();
		Fname_txtbox.sendKeys(obj_rndm.randomString("fname"));
		Lname_txtbox.sendKeys(obj_rndm.randomString("fname"));
		Email_txtbox.sendKeys(obj_rndm.randomString("email")+"@gmail.com");
		
	}
	public void enterPassword()
	{
		RandomFunction obj_rndm = new RandomFunction();
		String pws =obj_rndm.randomString("password");
		Password_txtbox.sendKeys(pws);
		ConfirmPassword_txtbox.sendKeys(pws);
	}
	
	public void clickOnregisterButton()
	{
		Register_btn.click();
	}
	public String getRegistrationText()
	{
		return Registation_text.getText();
	}
	
}
