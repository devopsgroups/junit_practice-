package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		
		
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.close();
	       
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
	     
	     
	      
	     driver.findElement(By.id("btnLogin")).click();
	     
	     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	     
	    List<WebElement> username = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr/td[2]/a"));
	     
	     for(int i = 0; i<= username.size()-1 ; i++  ){
	    	 
	    	 if(username.get(i).getText().equals("john.smith")){
	    		 
	    		 username.get(i).click();
	    	 }
	    	 
	     }
	     
	     
	     
	     System.out.println(username.size());
	     
	     username.get(2).click();
	     
	     
	     
	     		
	}

}
