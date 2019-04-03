package com.ibm.selenium.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.selenium.utility.WebDriverFactory;

public class WebElement_Count_Test {

	private static String input;

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("file:///C:/Users/IBM_ADMIN/eclipse-workspace/IBM_Selenium/Login_Form.html");
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.xpath("//input")).size()); 
		System.out.println(driver.findElements(By.xpath("//select")).size());
		System.out.println(driver.findElements(By.xpath("//table")).size());
		System.out.println(driver.findElements(By.tagName("input")).size());
		System.out.println(driver.findElements(By.xpath("//*")).size());
		System.out.println(driver.findElements(By.xpath("")));
		driver.etw
		
		 
		// int length = findElement.getTagName().length();
		 //System.out.println(length);
		 

	}

}
