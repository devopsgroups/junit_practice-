package com.selenium.intermediate.tutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	       WebDriver  driver = new ChromeDriver();
	     
	       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	       
	       
	       driver.findElement(By.xpath("//input[@name='proceed']")).click();
	       
	       Thread.sleep(3000);
	       
	       Alert alt  =  driver.switchTo().alert();
	       
	       System.out.println(alt.getText());
	       
	       Thread.sleep(3000);
	       
	       alt.accept();
	       
	       //alt.dismiss();
	       
	      
	       
	    
	 
	       
	
	
	}

}
