package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class VerifyBrokenLink {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com");
	      
	      List<WebElement> linklist = driver.findElements(By.xpath("//div[@id='sidebar']/aside[2]//ul/li/a"));
	      
	      // Actions act = new Actions(driver);
	       
	      
	      
	      
	      for(int i=0 ; i <= linklist.size()-1; i++ ){
	    	   
	    	// act.click(linklist.get(i)).perform();
	    	  
	    	  JavascriptExecutor jse =  (JavascriptExecutor)driver;
	    	  
	    	  
	    	  jse.executeScript("scroll(260,470)");
	    	  
	    	  
	    	  linklist.get(i).click();
	    	  
	    	  linklist = driver.findElements(By.xpath("//div[@id='sidebar']/aside[2]//ul/li/a"));
	    	  
	      }
		

	}

}
