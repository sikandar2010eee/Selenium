package com.ibm.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSearch_Chrome_Test {

	public static void main(String[] args) throws Exception  {
		
		  System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();//here Chromedriver object is converted into interface type: 
		  
		driver.get("www.google.com");
//		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//js.executeScript("document.getElementById('user_login').value = 'sikandar';");
//		js.executeScript("document.getElementById('user_login').setAttribute('value','sikandar2010eee@gmail.com')");
//		js.executeScript("document.getElementById('user_login').setAttribute('value','selenium')")
//		//driver.findElement(By.id("q")).sendKeys("sikandar");
	}}
		 
		 /* String title = driver.getTitle();
		  System.out.println(title);
		  System.out.println(driver.getWindowHandles());*/
		  //System.out.println(driver.getPageSource());
		  
		  
		  
		  
		  
		 /*//WebDriver driver1= new FirefoxDriver();//create an object of firefox driver
		  driver.findElement(By.xpath("//ul[@class='nav navbar-top-links navbar-right contents-1']/child::li[3]/button")).click();
		Actions act = new Actions(driver); 
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//form/div/div/div[@class='m-t']/button"))).click().perform();
		String parentwindow= driver.getWindowHandle();
		for(String mywindow: driver.getWindowHandles()) {
			if(!parentwindow.equalsIgnoreCase(mywindow)) {
				driver.switchTo().window(mywindow);
				driver.findElement(By.xpath("//body//form//input[@type='email']")).sendKeys("sikandar");
		  
			
			}}}}
	
	
	
		       
		        
		        
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='0']")));
	//System.out.println("xyz");
	//driver.findElement(By.xpath("//div[@class='xkfVF']/child::div[2]//input[@type='email']")).sendKeys("sikandar");
		
	
		  
*/	
		 
	

