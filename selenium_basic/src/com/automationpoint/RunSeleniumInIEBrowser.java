package com.automationpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunSeleniumInIEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		  

	}

}
