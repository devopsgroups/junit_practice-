package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleautosuggestion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.google.co.in/");
	      
	      driver.findElement(By.id("gs_htif0")).sendKeys("webDriver");
	      
	      
	      driver.findElement(By.xpath("//div[@class='sbqs_a']/descendant::b[contains(text(),' tutorial')]")).click();;
	      
	      
	      
	    
		
		
	}

}
