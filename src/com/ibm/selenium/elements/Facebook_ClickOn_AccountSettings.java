package com.ibm.selenium.elements;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.ibm.selenium.utility.WebDriverFactory;

public class Facebook_ClickOn_AccountSettings {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	
		
		
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sikandar2010eee \n @gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sultan_ahmad");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='_6qfu _5lxt']"))).click().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.facebook.com/settings']"))).click().perform();
		

	}

}
