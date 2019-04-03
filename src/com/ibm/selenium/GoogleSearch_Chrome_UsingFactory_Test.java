package com.ibm.selenium;

import org.openqa.selenium.WebDriver;


import com.ibm.selenium.utility.WebDriverFactory;

public class GoogleSearch_Chrome_UsingFactory_Test {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		//why "getBrowser" is called using the WebdriverFactory which is a class
		//why instance variable "CHROME" using the WebdriverFactory which is a class
		//this method is returning a driver object whose return type is WebDriver
		//why getBrowser method has been made as static. 
		Thread.sleep(1000);
		String url="www.google.com"; 
		driver.get(url);
		  

	}

}
