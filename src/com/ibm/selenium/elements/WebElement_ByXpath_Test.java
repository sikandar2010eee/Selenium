package com.ibm.selenium.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import com.ibm.selenium.utility.WebDriverFactory;

public class WebElement_ByXpath_Test {

	public static void main(String[] args) {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("file:///C:/Users/IBM_ADMIN/eclipse-workspace/IBM_Selenium/Login_Form.html");
		WebElement webelement1=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		webelement1.sendKeys("IBM");
		WebElement webelement2=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		webelement2.sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"id_sexmale\"]")).click();//radio button command
		driver.findElement(By.xpath("//*[@id=\"id_manualtester\"]")).click();//multiple choice 
		driver.findElement(By.xpath("//*[@id=\"id_automationtester\"]")).click();//multiple choice
		Select continent = new  Select (driver.findElement(By.xpath("//*[@id=\"continents\"]")));//using select class to get dropdown
		continent.selectByVisibleText("Asia");//selecting dropdown using 
		List<WebElement> options = continent.getOptions();
		for(int index=0;index<options.size();index++) {
			System.out.println("we are printing all the dropdown");
			System.out.println(options.get(index).getText());
		}
		
		//multiselect
		Select drpseleniumproject=  new Select(driver.findElement(By.xpath("//*[@id=\"id_seleniumprojects\"]")));
		if(drpseleniumproject.isMultiple()) {
			drpseleniumproject.selectByIndex(0);
			drpseleniumproject.selectByIndex(1);
			drpseleniumproject.selectByIndex(2);
			
		}
		List<WebElement> allSelectedOptions = drpseleniumproject.getAllSelectedOptions();
		for( int index=0;index<allSelectedOptions.size();index++) {
			System.out.println("Printing the multiple selected options");
			System.out.println(allSelectedOptions.get(index).getText());
		}
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		
		
		
		//WebElement webelement3 =driver.findElement(By.id("id_submit"));
		//*webelement3.click();
		//WebElement webelement4= driver.findElement(By.partialLinkText("Search"));
		//webelement4.click();
		//WebElement webelement4= driver.findElement(By.linkText("Google Search"));
		//webelement4.click();/*
		
	}

}
