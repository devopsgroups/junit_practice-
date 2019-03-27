package com.automationpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunSeleniumInFirefox {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");	
	  
	  WebDriver driver  = new FirefoxDriver();
		
	  driver.get("https://www.facebook.com/");
	
	}

}
