package com.ibm.selenium.advance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class Alert_JS_Code_Functionality {

	public static void main(String[] args) {
		 System.out.println("JavaScriptExecutor_Test...");
	        WebDriver driver = WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
	        // Creating the JavascriptExecutor interface object by Type casting
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // clicking with JavaScript...
	        //js.executeScript("alert('Hello')");
	        //js.executeScript("confirm('Did you like Selenium?')");
	        js.executeScript("prompt('Enter Selenium version:', 'Selenium 3.0');");

	}

}
