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
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	      
	      WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	      
	      WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	      
	      Actions act = new Actions(driver);
	      
	      act.dragAndDrop(source, target).perform();
	     
	      
	     
	      
	     
	}

}
