package com.webshop.testBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

public static  WebDriver driver;

	@BeforeMethod
    public void setUp() {
        // Initializes the Edge browser (Change to ChromeDriver if preferred)
			String br = "Edge";
		
		if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	        
        }else if(br.equalsIgnoreCase("chrome"))
        {
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();	
        	
        }else 
        {
        	System.out.println("Invaild Browser");
        }
		
		
        driver.get("https://demowebshop.tricentis.com/"); 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
	
	@AfterMethod
    public void tearDown() 
	{
     //   driver.quit();
	}
	
	
}
