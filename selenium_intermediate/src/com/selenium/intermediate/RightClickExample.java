package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      Actions act = new Actions(driver);
	      
	      act.contextClick(driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"))).perform();
	      
	      
	     
	}

}
