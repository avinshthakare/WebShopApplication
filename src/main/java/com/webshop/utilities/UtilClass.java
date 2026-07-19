package com.webshop.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.webshop.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public void dropdown(WebElement drop, String value)
	{ 
		Select s = new Select(drop);
		s.selectByContainsVisibleText(value);
	}

	public void dropdown(WebElement drop, int value)
	{ 
		Select s = new Select(drop);
		s.selectByIndex(value);
	}
	
	public static void takeSS(String testname)
	{
		
		try {
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");
		    String formattedDate = myDateObj.format(myFormatObj);
		    
			TakesScreenshot scn = (TakesScreenshot)driver;
			File src = scn.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\marsh\\eclipse-workspace\\WebShopApplication\\Screenshots\\"+testname+"-"+formattedDate+".png");
			FileHandler.copy(src, dest);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
