package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
         
		int duration = 10 ;
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new  ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
		WebElement element = driver.findElement(By.id("txtUsername"));
		
		
		JavascriptExecutor   js = (JavascriptExecutor) driver;;
	    
		
		//take original style of element
		String original_style = element.getAttribute("style");
		 
		// Chnage style of element
		 js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])",element,
	   "style","border: 2px solid red; border-style: dashed;");
	       
		 // Revert to original style
		 if (duration > 0) {
	            Thread.sleep(duration * 1000);
	            js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])",element,
	             "style",original_style);
	        }


	}

}
