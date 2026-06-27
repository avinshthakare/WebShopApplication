package com.webshop.testLayer;

import org.testng.annotations.Test;

import com.webshop.pageLayer.HomePage;
import com.webshop.testBase.TestBase;

public class LoginFunctionality extends TestBase {

	@Test
	public void verifyLoginFunctionality() throws InterruptedException{
	HomePage home_obj = new HomePage(driver);
	home_obj.clickOnLoginLink();
	Thread.sleep(4000);
}
	

}
