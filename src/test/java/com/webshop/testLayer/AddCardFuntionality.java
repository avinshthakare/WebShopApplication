package com.webshop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webshop.pageLayer.CheckoutPage;
import com.webshop.pageLayer.HomePage;
import com.webshop.pageLayer.ProductPage;
import com.webshop.pageLayer.ShoppingCartPage;
import com.webshop.testBase.TestBase;

public class AddCardFuntionality extends TestBase {
	@Test
	public void verifyUserBuyComputerAsGuest() throws InterruptedException

	{
		
		String Expect_result ="Your order has been successfully processed!";
		String Actual_result;
		HomePage home_obj = new HomePage(driver);
		ProductPage product_obj = new ProductPage(driver);
		ShoppingCartPage cart_obj = new ShoppingCartPage(driver);
		CheckoutPage checkout_obj = new CheckoutPage(driver);
		
		
		home_obj.enterAndSearchProduct("Build your own cheap computer");
		Thread.sleep(2000);
		home_obj.clickOnAddCartButton();
		Thread.sleep(2000);
		product_obj.selectMandateDetails();
		product_obj.clickOnAddcartButton();
		Thread.sleep(2000);
		cart_obj.clinkOnShoppingcartLink();
		Thread.sleep(2000);
		cart_obj.clinkOnTermsOfServiceCheckbox();
		cart_obj.clinkOnCheckoutBotton();
		Thread.sleep(2000);
		checkout_obj.clickOnCheckoutAsGuestButton();
		Thread.sleep(2000);
		checkout_obj.enterBillingAddressDetails();
		Thread.sleep(2000);
		checkout_obj.enterShippingAddressDetails();
		Thread.sleep(2000);
		checkout_obj.selectShippingMethod();
		Thread.sleep(2000);
		checkout_obj.selectPaymentMethod();
		Thread.sleep(2000);
		checkout_obj.enterPaymentInfo();
		Thread.sleep(2000);
		checkout_obj.confirmOrder();
		Thread.sleep(2000);
		Actual_result= checkout_obj.actualresult();
		Assert.assertEquals(Actual_result, Expect_result);
		
	}

}
