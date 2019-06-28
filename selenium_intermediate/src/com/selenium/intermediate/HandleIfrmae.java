package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIfrmae {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	     // driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a")).click();
	      
	      
	      
	      // swith to frame by index
	     // driver.switchTo().frame(0);
	      
	   // swith to frame by taking frame as webelement
	      driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      driver.findElement(By.id("draggable")).click();
	      
	    
	     
	}

}
