package com.ibm.selenium.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ibm.selenium.utility.WebDriverFactory;

public class WebElement_Facebook_Test {

	public static void main(String[] args) throws Exception {
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
		

		
		//action.moveToElement(driver.findElement(By.xpath("//a[@href='http://realestate.upskills.in/region/new-launch-in-bangalore/']"))).build().perform();;
		
		/*driver.findElement(By.name("email")).sendKeys("sikandar2010eee@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sultan_ahmad");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3ixn']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();*/
		
	
		//System.out.println("My name is "+driver.findElement(By.name("email")).getAttribute("value"));
		//System.out.println("My password is "+driver.findElement(By.name("pass")).getAttribute("value"));
	

	}

}
