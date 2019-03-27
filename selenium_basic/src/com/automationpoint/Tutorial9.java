package com.automationpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial9 {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "D:\\software\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser and put implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				//Open Orange HRM
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//Testing some thing difference which make lost in all tha span of line
		
		
		
		
		// Do login
		 Thread.sleep(2000);
		 driver.findElement(By.id("txtUsername")).clear();
	     driver.findElement(By.id("txtUsername")).sendKeys("adminsssss");
	     driver.findElement(By.id("txtPassword")).sendKeys("adminsssssss");
         
	     driver.findElement(By.id("btnLogin")).click();
	     
	     
	     driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	     
	     
	     driver.findElement(By.xpath("//div[@id='social-icons']/a[1]/img")).click();
	     
	     
         System.out.println("Loged in to Orange HRM");
	}

}
