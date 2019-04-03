package com.ibm.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_016 {

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://realestate.upskills.in/");
		driver.findElement(By.xpath(""))
		

	}

}
