package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleautosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.google.co.in/");
	      
	      driver.findElement(By.xpath("//input[@name='q']")).sendKeys("webDriver");
	      
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[contains(text(),'webdriver in selenium')]")).click();
	      
	      ////div[@class='sbqs_a']/descendant::b[contains(text(),' tutorial')]
	      
	    
		
		
	}

}
