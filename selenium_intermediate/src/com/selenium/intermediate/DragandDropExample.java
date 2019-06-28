package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	          
	      
	      // swith to frame by index
	     // driver.switchTo().frame(0);
	      
	   // swith to frame by taking frame as webelement
	      driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      Actions act = new Actions(driver);
	      
	      WebElement  x = driver.findElement(By.id("draggable"));
	      
	      WebElement y = driver.findElement(By.id("droppable"));
	      
	      act.dragAndDrop(x, y).build().perform();
	      
	      
	     
	}

}
