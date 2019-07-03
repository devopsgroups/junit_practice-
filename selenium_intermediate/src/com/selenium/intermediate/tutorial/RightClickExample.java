package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      Actions act = new Actions(driver);
	      
	      act.contextClick(driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"))).perform();
	      
	      
	     
	}

}
