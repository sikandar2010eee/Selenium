package com.ibm.selenium.advance;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class Alert_JS_Test {

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");

		
		//driver.get("file:///C:/Users/IBM_ADMIN/eclipse-workspace/IBM_Selenium/Alert.html");
		//driver.findElement(By.name("cusid")).sendKeys("12345");
		 // This step will result in an alert on screen
		
		//ChromeDriver driver1= new ChromeDriver();// you can call directly...the why u need to cast it...they say 
       // WebDriver driver2=driver1;// coz of run time polymosphism....
		
        //WebElement submitElement = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
        //WebElement submitElement = driver.findElement(By.xpath("//button[@onclick='alertFunction()()']"));
       // WebElement submitElement = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
        //submitElement.submit();    
        
        // Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;// why this type casting.....
       // js.executeScript("arguments[0].click()", submitElement);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
       

	}

}
