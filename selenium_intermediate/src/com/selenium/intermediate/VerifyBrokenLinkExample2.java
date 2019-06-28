package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenLinkExample2 {
	
	public static ChromeDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		
	       System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	       driver = new ChromeDriver();
	     
	       driver.get("https://jqueryui.com");
	       
	     //  driver.navigate().to("https://jqueryui.com");
	      
	     // List<WebElement> linklist = driver.findElements(By.xpath("//div[@id='sidebar']/aside[2]//ul/li/a"));
	      
	      // Actions act = new Actions(driver);
	      
	    
	       
	      String part1 = "//div[@id='sidebar']/aside[1]//ul/li[";
	      
	      String Part2 = "]/a" ;
	      
	      int i = 1;
	      
	    
	       while(isElementPresent(part1+i+Part2))
	     {
	    	   
	    	// act.click(linklist.get(i)).perform();
	    	  
	    	 //JavascriptExecutor jse =  (JavascriptExecutor)driver;
	    	  
	    	  
	    	 //jse.executeScript("scroll(260,450)");
	    	 
	    	 Thread.sleep(3000);
	    	  
	    	  System.out.println(part1+i+Part2);
	    	  
	    	  //System.out.println(driver.findElement(By.xpath(part1+i+Part2)).getText());
	    	  
	    	  driver.findElement(By.xpath(part1+i+Part2)).click();
	    	  
	    	  WebElement linktext = driver.findElement(By.xpath(part1+i+Part2));
	    	  
	    	 System.out.println("Title of new Page"+ driver.getTitle()+ "Link Text :" + linktext.getText() );
	    	 
	    	  Thread.sleep(3000);
	    	  
	    	  driver.navigate().back();
	    	  
	    	  Thread.sleep(3000);
	    	  
	    	  driver.navigate().refresh();;
	    	 
	    	  i++;
	    	 
	    	  
	      }
		 
	 }

	public static boolean isElementPresent(String Xpath){
		
		 
		List<WebElement> linkelement = driver.findElements(By.xpath(Xpath));
		
		if(linkelement.size()==0){
			
			return false;
		}
		else{
			
			return true;
			
		}
		
	}
	
	
	
	
	
	
}
