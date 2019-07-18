package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascriptExample {
	
	  //Javascript to make element visilbe 
    //"arguments[0].scrollIntoView()";

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	       WebDriver  driver = new ChromeDriver();
	     
	       driver.get("https://www.facebook.com/");
	       
	           
	       WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
	       
	       Thread.sleep(2000);
	       
	       JavascriptExecutor js =  (JavascriptExecutor) driver;
	       
	       js.executeScript("arguments[0].scrollIntoView();", element);
	       
	       
	       
	       
	    
	       
	     
	}

}
