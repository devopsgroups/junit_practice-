package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIfrmae {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	     
	     // swith to frame by taking frame as webelement
	      
	     driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	     
	     System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")).getText());
	    
	     //driver.switchTo().defaultContent();
	      
	     System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Enable any DOM element to be droppable, a target f')]")).getText());
		    
	    
	}

}
