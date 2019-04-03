package com.ibm.selenium.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ibm.selenium.utility.WebDriverFactory;

public class RETC_036 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("http://realestate.upskills.in/");
		String mywindowHandle = driver.getWindowHandle();//current window
		driver.findElement(By.linkText("VILLAS")).click();
		Thread.sleep(3000);
		boolean displayed = driver.findElement(By.xpath("//h1[contains(text(),'Region: Villas')]")).isDisplayed();
		System.out.println(displayed);

		boolean enabled = driver.findElement(By.xpath("//div[@id='ajaxsearchlite1']//input[@placeholder='Search here for Properties..']")).isEnabled();
		System.out.println(enabled);

		driver.findElement(By.xpath("//div[@id='ajaxsearchlite1']//input[@placeholder='Search here for Properties..']")).sendKeys("quis nostrud exercitation ullamco laboris");
		Thread.sleep(2000);
		//boolean displayed2 = driver.findElement(By.xpath("//a[contains(text(),'quis nostrud exercitation ullamco laboris')]")).isDisplayed();
		//System.out.println(displayed2);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'quis nostrud exercitation ullamco laboris')]")).click();

		    Set<String> handles = driver.getWindowHandles();//window handle of all the current window.

		for(String winhandle:handles) {//here u are searching ur currently opened window in the list of all windows
			if(mywindowHandle.equals(winhandle)) {//if this condition is not true...then line 41 will not be executed and control will go to the start of the for loop
				continue;

			}
			driver.switchTo().window(winhandle);
			//it will click in the newly opened window.
		}
		
		driver.findElement(By.linkText("Drop Us a Line")).click(); 
		//System.out.println(driver.getCurrentUrl());
		

		/*ArrayList<String> windowlist= new ArrayList<>(driver.getWindowHandles());
Iterator<String> itr= windowlist.iterator();
while(itr.hasNext()) {
	String url=itr.next();
	String urlexpected="http://realestate.upskills.in/quis-nostrud-exercitation-ullamco-laboris/";
	if(url.equals(urlexpected)) 

		System.out.println(url);

	}*/



	}}