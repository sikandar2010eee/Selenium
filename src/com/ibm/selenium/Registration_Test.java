package com.ibm.selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class Registration_Test {

	public static void main(String[] args) {
		WebDriver driver=WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://newtours.demoaut.com/");
		
	      
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manzoor");
	System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).getAttribute("value"));	;
	
	//driver.findElement(By.xpath(""))
		

}}
