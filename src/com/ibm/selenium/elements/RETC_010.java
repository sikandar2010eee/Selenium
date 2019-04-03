package com.ibm.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_010 {

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://realestate.upskills.in/");
		
		//RETC09
		driver.findElement(By.linkText("NEW LAUNCH")).click();
		driver.findElement(By.xpath("//input[@id='keyword_search']")).sendKeys("Electronic City");
		driver.findElement(By.xpath("//a[@class='chosen-single chosen-default']/span[contains(text(),'Property type')]")).click();
		driver.findElement(By.xpath("//ul[@class='chosen-results']/li[4]")).click();
		driver.findElement(By.xpath("//a[@class='chosen-single chosen-default']/span[contains(text(),'Any Regions')]")).click();
		driver.findElement(By.xpath("//ul[@class='chosen-results']/li[6]")).click();
		driver.findElement(By.xpath("//button[@class='button fullwidth']")).click();
		driver.findElement(By.xpath("//a[@class='button fullwidth margin-top-20']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("sikandar");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("sikandar2010eee@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("apartments");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("looking for apartments");
		driver.findElement(By.xpath("//input[@value='Send']")).click();


	}

}
