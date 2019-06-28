package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateCalender {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
       
	      
	     driver.findElement(By.id("btnLogin")).click();
	     
	    // click on leave menu items
	     
	     driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).click();
	     
	   // click on calender icon
	   driver.findElement(By.xpath("//li[input[@id='calFromDate']]//img")).click();
	 //div[@id='ui-datepicker-div']//select[1]
	   
	   WebElement  monthddselect = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[1]"));
	   
	   Select monthdd = new Select(monthddselect);
	   
	   monthdd.selectByIndex(4);
	   
	   
      WebElement  yearddselect = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[2]"));
	   
	   Select yeardd = new Select(yearddselect);
	   
	   yeardd.selectByVisibleText("2019");
	   
	  
	   driver.findElement(By.xpath("//a[text()='20']")).click();
	   
	}

}
