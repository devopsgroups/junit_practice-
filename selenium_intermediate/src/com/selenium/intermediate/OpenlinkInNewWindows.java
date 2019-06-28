package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkInNewWindows {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      Actions act = new Actions(driver);
	      
	      
	      // Shift + Click
	      
	      WebElement target = driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"));
	      
	      act.keyDown(Keys.SHIFT).click(target).keyUp(Keys.SHIFT).perform();	      

	}

}
