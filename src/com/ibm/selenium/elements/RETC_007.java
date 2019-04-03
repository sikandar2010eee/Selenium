package com.ibm.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_007 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://realestate.upskills.in/");
		driver.findElement(By.linkText("APARTMENTS")).click();
		driver.findElement(By.xpath("//div[@class='row']//div[6]//div[1]//a[1]//div[1]")).click();
		//before 
		//String cssValue = driver.findElement(By.xpath("//input[@name='your-name']")).getCssValue("background-color");
		//System.out.println(cssValue);//rgba(252, 252, 252, 1)
		//String asHex = Color.fromString(cssValue).asHex();
		//System.out.println(asHex);
		//driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("sikandar2010eee@gmail.com");
		//driver.findElement(By.xpath("//input[@name='your-subject']")).sendKeys("apartments");
		//driver.findElement(By.xpath("//textarea[@name='your-message']")).sendKeys("looking for apartments");
		driver.findElement(By.xpath("//input[@value='Send']")).click();
		Thread.sleep(3000);
		String cssValue = driver.findElement(By.xpath("//input[@name='your-name']")).getCssValue("background-color");
		System.out.println(cssValue);
		String s1=Color.fromString(cssValue).asHex();
		System.out.println(s1);
		Actio
		//getting error while sending message "there was an error while sending message please try again latter"

	}

}
