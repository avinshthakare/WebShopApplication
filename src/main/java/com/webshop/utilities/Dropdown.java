package com.webshop.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
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
}
