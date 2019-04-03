package com.ibm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin");
		driver.findElement(By.xpath("//input[@name='log']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Actions act = new Actions(driver);
		// act.sendKeys(Keys.ENTER).perform();*/
		act.moveToElement(driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']/a/img"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit My Profile')]"))).click().perform();
		act.dragAndDrop(driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']/a/img")), driver.findElement(By.xpath("//a[contains(text(),'Edit My Profile')]"))).perform();
		
		act.sendKeys(Keys.RETURN).perform();
		act.sendKeys(driver.findElement(By.xpath("//input[@name='log']")), "sikandar",Keys.ENTER);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.CONTROL);
		act.keyDown(target, Keys.
		//Thread.sleep(2000);
		//act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit My Profile')]"))).click();*/
	}

}
