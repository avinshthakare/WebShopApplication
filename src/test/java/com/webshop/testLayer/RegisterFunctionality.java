package com.webshop.testLayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webshop.pageLayer.HomePage;
import com.webshop.pageLayer.RegisterPage;
import com.webshop.testBase.TestBase;
import com.webshop.utilities.RandomFunction;

public class RegisterFunctionality extends TestBase {

	@Test
	public void verifyRegisterFunctionality() throws InterruptedException
	{
		//---------Expected Outcomes-------------
		
		String Expected_result = "Your registration completed";
		
		
		//---------Page Object creation-----------
		HomePage obj_home = new HomePage(driver);
		RegisterPage obj_Rst = new RegisterPage(driver);
		
		
		//------------Testcase -------------------------
		
		obj_home.clickOnRegisterLink();
		Thread.sleep(2000);
		obj_Rst.enterDeatails();
		obj_Rst.enterPassword();
		obj_Rst.clickOnregisterButton();
		Thread.sleep(5000);
		String Actual_result = obj_Rst.getRegistrationText();
		Assert.assertEquals(Actual_result, Expected_result);	
	}
	
}
