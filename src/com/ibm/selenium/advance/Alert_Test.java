package com.ibm.selenium.advance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class Alert_Test {

	public static void main(String[] args) throws Exception {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//driver.findElements(By.xpath("")).size()//
		
		Thread.sleep(5000);
		alert.accept();
		

	}

}
