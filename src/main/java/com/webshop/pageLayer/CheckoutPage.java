package com.webshop.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.utilities.UtilClass;
import com.webshop.utilities.RandomFunction;

public class CheckoutPage {

	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 //--------------------Obj Repo-------------------------------
	
	@FindBy(xpath="//input[@value='Checkout as Guest']")
	WebElement Checkout_Guest_btn;
	
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	WebElement Fname_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	WebElement Lname_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	WebElement Company_txtbox;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	WebElement Contry_dropdown;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_StateProvinceId']")
	WebElement State_dropdown;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement City_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement Address1_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
	WebElement Address2_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement PostalCode_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement PhoneNumber_txtbox;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
	WebElement FaxNumber_txtbox;
	
	@FindBy(xpath="//input[@onclick='Billing.save()']")
	WebElement Continue_btn;
	
	@FindBy(xpath="//input[@id='PickUpInStore']")
	WebElement PickUpInStore_checkbox;
	
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	WebElement Shipping_saveBtn;
	
	@FindBy(xpath="//input[@id='shippingoption_1']")
	WebElement shippingMethod_rdio_btn;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	WebElement ShippingMethod_saveBtn;
	
	@FindBy(xpath="//input[@id='paymentmethod_2']")
	WebElement PaymentMethod_rdio_btn;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	WebElement PaymentMethod_saveBtn;
	//------------------------paymentinfo------------------------------------------------------
	@FindBy(xpath="//select[@id='CreditCardType']")
	WebElement Creditcard_dropdown;
	
	@FindBy(xpath="//input[@id='CardholderName']")
	WebElement CardHoldder_txtbox;
	
	@FindBy(xpath="//input[@id='CardNumber']")
	WebElement CardNo_txtbox;
	
	@FindBy(xpath="//select[@id='ExpireMonth']")
	WebElement Month_dropdown;
	
	@FindBy(xpath="//select[@id='ExpireYear']")
	WebElement Year_dropdown;
	
	@FindBy(xpath="//input[@id='CardCode']")
	WebElement CardCode_txtbox;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	WebElement PaymentInfo_saveBtn;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	WebElement Confirm_saveBtn;
	
	@FindBy(xpath="//strong[contains(text(),'successfully processed!')]")
	WebElement OrderSubmit_text;
	
	@FindBy(xpath="//li[contains(text(),'Order number')]")
	WebElement OrderNumber_text;
	
	
	
	
	
	
	 //--------------------Action Methods-------------------------
	
	public void clickOnCheckoutAsGuestButton()
	{
		Checkout_Guest_btn.click();	
	}
	
	public void enterBillingAddressDetails() throws InterruptedException
	{	UtilClass select = new UtilClass();
		RandomFunction ran = new RandomFunction();
		Fname_txtbox.sendKeys(ran.randomString("fname"));
		Lname_txtbox.sendKeys(ran.randomString("lname"));
		Email_txtbox.sendKeys(ran.randomString("email")+"@gmail.com");
		Company_txtbox.sendKeys("TCS");
		select.dropdown(Contry_dropdown, "India");
		Thread.sleep(1000);
		select.dropdown(State_dropdown,0);
		City_txtbox.sendKeys("Nagpur");
		Address1_txtbox.sendKeys("patali gali k niche");
		Address2_txtbox.sendKeys("Adheri gufa k pass");
		PostalCode_txtbox.sendKeys(ran.randomString("postalcode"));
		PhoneNumber_txtbox.sendKeys(ran.randomString("phone"));
		FaxNumber_txtbox.sendKeys(ran.randomString("fax"));
		Continue_btn.click();
		
	}

	public void enterShippingAddressDetails()
	{
		//PickUpInStore_checkbox.click();
		Shipping_saveBtn.click();	
	}
	
	public void selectShippingMethod()
	{
		shippingMethod_rdio_btn.click();
		ShippingMethod_saveBtn.click();	
	}
	public void selectPaymentMethod()
	{
		PaymentMethod_rdio_btn.click();
		PaymentMethod_saveBtn.click();	
	}
	
	public void enterPaymentInfo()
	{
		UtilClass select = new UtilClass();
		select.dropdown(Creditcard_dropdown,"Master");
		CardHoldder_txtbox.sendKeys("Shaktiman");
		CardNo_txtbox.sendKeys("1111111");
		select.dropdown(Month_dropdown, "02");
		select.dropdown(Year_dropdown, "2029");
		CardCode_txtbox.sendKeys("111");
		PaymentInfo_saveBtn.click();	
	}
	
	public void confirmOrder()
	{
		Confirm_saveBtn.click();
	}
	
	public String actualresult()

	{
	  System.out.println(OrderNumber_text.getText());
      return OrderSubmit_text.getText();
		
	}
}
