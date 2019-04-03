package com.ibm.selenium.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
	public static String FIREFOX = "firefox";
	public static String CHROME = "chrome";
	public static String SAFARI = "safari";
	public static String IE = "IE";
	public static String DRIVER_PATH = "driver\\";

	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			System.setProperty("webdriver.gecko.driver", DRIVER_PATH + "geckodriver.exe");
			return new FirefoxDriver();
		case "chrome":
			System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
			return new ChromeDriver();
		case "IE":
			System.setProperty("webdriver.ie.driver", DRIVER_PATH + "IEDriverServer.exe");
			// put DesiredCapability based on your IE instance
			return new InternetExplorerDriver();
		case "safari":
			return new SafariDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return new FirefoxDriver();
		}
	}

	

	
}
