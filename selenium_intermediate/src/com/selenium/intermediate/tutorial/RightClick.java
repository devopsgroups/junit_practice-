package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      WebElement elementToperformrightclick = driver.findElement(By.xpath("//a[contains(text(),'API Documentation')]")); 
	      
	      Actions act = new Actions(driver);
	      
	      act.contextClick(elementToperformrightclick).perform();
	      
	      
	      
	     
	}

}
