package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentActionOnTextBox {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
	     driver.findElement(By.id("txtUsername")).sendKeys("adminghfgafahf");
	     
	     System.out.println(driver.findElement(By.id("txtUsername")).getAttribute("value"));
	     
	     
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).clear();
	     
	     
       
	      
	    

	}

}
