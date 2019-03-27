package com.automationpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("u_0_9")).click();
		System.out.println("Radio button is clicked");
		
		
		
		
		
		
		
		}

}
