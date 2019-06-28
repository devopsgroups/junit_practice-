package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithouSelectClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      
	      WebElement  yeardd = driver.findElement(By.xpath("//select[@id='year']"));
	      
	      yeardd.sendKeys("2005");
	      
	      
	     
	      List<WebElement>  yeardditems  = yeardd.findElements(By.tagName("option"));
	    
	    
	     for(int i =0 ; i<=yeardditems.size()-1; i++) {
	    	
	    	System.out.println("Text : "+ yeardditems.get(i).getText() + "   Selected items of Drop down: " + yeardditems.get(i).isSelected());
	    	
	    	
	    }
	       
	
	
	}

}
