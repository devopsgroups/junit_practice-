package com.selenium.intermediate.tutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlers {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bseindia.com/");
		
		driver.findElement(By.xpath("//div[@class='col-md-3 sociolinkarea1024']//li[1]//a[1]")).click();
		
		Set<String> windowsHandlers = driver.getWindowHandles();
		
		Iterator<String> it =  windowsHandlers.iterator();
		
		String windows1 = it.next();
		String windows2 = it.next();
		
		driver.switchTo().window(windows2);
		
		
		
		
		
	    
	    System.out.println("Label of username fiels "+driver.findElement(By.xpath("//label[contains(text(),'Email or Phone')]")).getText());
	    
	    
	    
	   
		
	}

}
