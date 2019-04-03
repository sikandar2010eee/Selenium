package com.ibm.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_demo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver;
        DesiredCapabilities capability =DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.VISTA);
        driver = new RemoteWebDriver(new URL("http://192.168.1.6:5555/wd/hub"),capability);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        
     
      
        
	}

}
