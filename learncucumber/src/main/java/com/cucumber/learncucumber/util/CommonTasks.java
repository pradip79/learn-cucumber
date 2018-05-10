package com.cucumber.learncucumber.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonTasks {

	private static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void navigateToURL(WebDriver driver, String URL) {
		driver.get(URL);
	}

}
