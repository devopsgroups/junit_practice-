package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe"); 
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/resizable/");
	      driver.switchTo().frame(0);
	      
	      //driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      WebElement source = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	      Actions act = new Actions(driver);
	      
	      
	      Thread.sleep(5000);
	      
	      //After 5 seconds, This will resize jQuery resizable element by -100 pixel X,Y offset using the combination of clickAndHold, moveByOffset and release methods of Actions class.
	     
	      act.clickAndHold(source).moveByOffset(250,50).release().perform();
		
		
	}

}
