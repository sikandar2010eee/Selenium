package com.ibm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import com.ibm.selenium.utility.WebDriverFactory;

public class WebDriver_Command_Test {

	public static void main(String[] args) {
		WebDriver driver=WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		String url="https://www.google.com";
		driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL:" + currentUrl);
        System.out.println (driver.findElement(By.tagName("title")).getText());
        
      // String pageSource = driver.getPageSource();
        //System.out.println("Page Source:"+pageSource+"\tLength:"+pageSource.length());
        
       // String title = driver.getTitle();
       // System.out.println("Page Title:"+title);
       

	}

}
