package com.ibm.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_008 {

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://realestate.upskills.in/");
		driver.findElement(By.linkText("APARTMENTS")).click();
		driver.findElement(By.xpath("//div[@class='row']//div[6]//div[1]//a[1]//div[1]")).click();
		driver.findElement(By.xpath("//div[@class='calc-input']//input[@id='amount']")).sendKeys("400000");
		driver.findElement(By.xpath("//div[@class='calc-input']//input[@id='downpayment']")).sendKeys("20000");
		driver.findElement(By.xpath("//div[@class='calc-input']//input[@id='years']")).sendKeys("20");
		driver.findElement(By.xpath("//div[@class='calc-input']//input[@id='interest']")).sendKeys("7.25");
		driver.findElement(By.xpath("//button[@class='button calc-button']")).click();

	}

}
