package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
       
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://jqueryui.com/droppable/");
		 
		 
		 WebElement mouseoverelement = driver.findElement(By.xpath("//a[contains(text(),'Contribute')]")); 
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(mouseoverelement).perform();
		 
		 
		//a[contains(text(),'Code')]
		 driver.findElement(By.xpath("//a[contains(text(),'Codes')]")).click();
		 
		 
	}

}
