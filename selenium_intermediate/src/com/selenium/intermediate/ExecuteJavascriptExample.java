package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascriptExample {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	       WebDriver  driver = new ChromeDriver();
	     
	       driver.get("https://www.facebook.com/");
	       
	      WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
          Thread.sleep(5000);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	    //This will scroll the page till the element is found		
	      js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
