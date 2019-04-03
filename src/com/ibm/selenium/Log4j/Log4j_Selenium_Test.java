package com.ibm.selenium.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.selenium.utility.WebDriverFactory;

public class Log4j_Selenium_Test {

	public static void main(String[] args) {
		System.out.println("1-Start->ExceptionHandling_Test...");

		Logger log = Logger.getLogger(Log4j_Selenium_Test.class.getName());
		DOMConfigurator.configure("Log4j.xml");
		WebDriver driver = WebDriverFactory.getBrowser(WebDriverFactory.CHROME);
		driver.get("file:///C:/Users/IBM_ADMIN/eclipse-workspace/IBM_Selenium/Login_Form.html");
		try {
			System.out.println("2-loginname...");
			WebElement we_id_name = driver.findElement(By.id("id_username"));// as the element is not found the rest of
																				// the code in the try block will be
																				// skipped and JVM
			log.info("Login form is opened.....");// will try to find the catch block and execute the message.
			we_id_name.sendKeys("IBM");
			log.info("login name is entered...");
			System.out.println("3-password...");
			WebElement we_password = driver.findElement(By.name("LASTNAME"));
			we_password.sendKeys("Password");
			log.info("password is entered....");
			System.out.println("4-After...");
		} catch (NoSuchElementException ex) {

			log.warn("5-Unable to locate Element:submit1..." + ex.getMessage());

			// ex.printStackTrace();
		} catch (Exception ex) {
			log.info("error");
			log.warn("6-General error occured..." + ex.getMessage());
			// ex.printStackTrace();
		}
		System.out.println("7-End->ExceptionHandling_Test...");

	}

}
