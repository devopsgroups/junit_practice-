package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      Actions act = new Actions(driver);
	      
	      WebElement  source = driver.findElement(By.id("draggable"));
	      
	      WebElement target = driver.findElement(By.id("droppable"));
	      
	      act.dragAndDrop(source, target).build().perform();
	      
	      
	     
	}

}
