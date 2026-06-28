package com.webshop.testLayer;

import org.testng.annotations.Test;

import com.webshop.pageLayer.HomePage;
import com.webshop.pageLayer.ProductPage;
import com.webshop.testBase.TestBase;

public class AddCardFuntionality extends TestBase {
	@Test
	public void verifyUserBuyComputerAsGuest() throws InterruptedException

	{
		HomePage home_obj = new HomePage(driver);
		ProductPage product_obj = new ProductPage(driver);
		
		home_obj.enterAndSearchProduct("Build your own cheap computer");
		Thread.sleep(2000);
		home_obj.clickOnAddCartButton();
		Thread.sleep(2000);
		product_obj.selectMandateDetails();
		Thread.sleep(5000);
		
	}

}
