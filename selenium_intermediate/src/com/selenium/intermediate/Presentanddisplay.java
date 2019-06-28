package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Presentanddisplay {

	public static void main(String[] args) {
        
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("hidden Element =" + driver.findElement(By.xpath("//li[a[span[text()='My Account']]]/a")).isEnabled());
		System.out.println("Element is displayed =" + driver.findElement(By.xpath("//li[a[span[text()='My Account']]]/a")).isDisplayed());
		driver.findElement(By.xpath("//div[@id='gbwa']")).click();
		
		System.out.println("hidden Element =" + driver.findElement(By.xpath("//li[a[span[text()='My Account']]]/a")).isEnabled());
	    System.out.println("Element is displayed =" + driver.findElement(By.xpath("//li[a[span[text()='My Account']]]/a")).isDisplayed());
	}

}
