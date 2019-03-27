package com.automationpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 // Handle drop down using selenium	
	     
		 Thread.sleep(10000);
		 
		 WebElement droprdownday  = driver.findElement(By.id("day"));
		 
		 Select drp  = new Select(droprdownday);
		 
		 drp.selectByVisibleText("20");
	   
		

	}

}
