package com.crm.qa.util;

import org.openqa.selenium.WebElement;

public class CommonFunctions {

	
	
	public static void sendKeys(WebElement element,String textToEnter)
	{
		element.sendKeys(textToEnter);
	}
}
