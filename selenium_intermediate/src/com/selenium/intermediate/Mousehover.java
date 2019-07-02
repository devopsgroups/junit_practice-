package com.selenium.intermediate;

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
		
		
//	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
//	     
//	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
//       
//	      
//	     driver.findElement(By.id("btnLogin")).click();
//	     
//	    // click on leave menu items
//	     
//	     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	     
	     WebElement jobelement = driver.findElement(By.xpath("//a[contains(text(),'Contribute')]"));
	     
	     Actions act = new Actions(driver); 
	     
	     act.moveToElement(jobelement).perform();
	     
	     

	}

}
