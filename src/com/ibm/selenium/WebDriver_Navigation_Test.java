package com.ibm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Navigation_Test {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		Navigation nav=  driver.navigate();
		 nav.to("https://www.seleniumhq.org/");
	
		
		  
		  
		 
		
		  
		

	}

}
