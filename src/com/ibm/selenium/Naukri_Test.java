package com.ibm.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(10000);
		
		
			
			System.out.println("before notification");
		driver.findElement(By.xpath("//div[@id='geoLocPopUp']/span[@id='block']")).click();
		System.out.println("after notification");
		Thread.sleep(2000);
		//Actions act= new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//ul[@class='midSec menu']/li/a[@title='Search Jobs']"))).build().perform();

	}

}
