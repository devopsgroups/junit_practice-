package com.selenium.intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlers {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[3]/a")).click();
		
		Set<String> windowsHandlers =  driver.getWindowHandles();
		
	    Iterator<String> it4= windowsHandlers.iterator();
	    
	    String windoews1 = it4.next();
	    String windoews2 = it4.next();
	    
	    System.out.println(windoews1);
	    System.out.println(windoews2);
	    
	    driver.switchTo().window(windoews2);
	    
	    
	    
	   
	    driver.findElement(By.id("withoutPnr")).click();
	    
	    driver.switchTo().defaultContent();
		
	}

}
