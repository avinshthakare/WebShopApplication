package com.webshop.testBase;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

public static  WebDriver driver;

	@BeforeMethod
    public void setUp() {
        // Initializes the Edge browser (Change to ChromeDriver if preferred)
		WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://demowebshop.tricentis.com/"); 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
	
	@AfterMethod
    public void tearDown() 
	{
        driver.quit();
	}
	
	
}
