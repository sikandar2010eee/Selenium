package com.ibm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSearch_Internet_Explorer_Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");

		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver1 = new InternetExplorerDriver(cap);
		Thread.sleep(5000);
		String url = "https://www.google.com";
		driver1.get(url);
		driver1.close();
		driver1.quit();
		


	}

}
