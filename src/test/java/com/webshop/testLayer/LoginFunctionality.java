package com.webshop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webshop.pageLayer.HomePage;
import com.webshop.pageLayer.LoginPage;
import com.webshop.testBase.TestBase;

public class LoginFunctionality extends TestBase {
   
	@Test
	public void verifyLoginFunctionality() throws InterruptedException{
	String Email = "AkshayKumar11@gmail.com";	
	
	//-----------------Page Object Creation-----------------
	HomePage home_obj = new HomePage(driver);
	LoginPage login_obj= new LoginPage(driver);
	
	//---------------------Test Cases-----------------
	home_obj.clickOnLoginLink();
	Thread.sleep(2000);
	login_obj.enterEmail(Email);
	login_obj.enterPassword("AkshayKumar ");
	login_obj.clickOnRememberCheckbox();
	login_obj.clickOnLoginButton();
	Thread.sleep(2000);
	// get Email after Login
	String Actual_Email = login_obj.getEmail();
	Assert.assertEquals(Actual_Email, Email);
	
}
	

}
