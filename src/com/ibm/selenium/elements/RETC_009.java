package com.ibm.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_009 {

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
		


	}

}
