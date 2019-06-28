package com.selenium.intermediate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Apple']"))));
		
		driver.findElement(By.xpath("//span[text()='Apple']")).click();
		
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='iPhone']"))));
	     driver.findElement(By.xpath("//img[@alt='iPhone']")).click();
	     
	     List<WebElement> mobileName =  driver.findElements(By.cssSelector("._3wU53n"));
		 
	     List<WebElement> mobileprice =  driver.findElements(By.cssSelector("._1vC4OE._2rQ-NK"));
	     
	     for(int i=0; i<= mobileName.size()-1; i++  ){
			 System.out.println("Mobile Name "+mobileName.get(i).getText()+"Price: "+mobileprice.get(i).getText());
			 
		 }
	     int x = driver.findElement(By.xpath("//span[text()='Next']")).getLocation().getX();
	     int y = driver.findElement(By.xpath("//span[text()='Next']")).getLocation().getY();
	     System.out.println(driver.findElement(By.xpath("//span[text()='Next']")).getLocation().getX());
	     System.out.println(driver.findElement(By.xpath("//span[text()='Next']")).getLocation().getY());
	     
   	     
   	    // driver.findElement(By.xpath("//span[text()='Next']")).click();
   	     
   	     WebElement elements =driver.findElement(By.cssSelector("._316MJb"));
   	    List<WebElement>  allpage = elements.findElements(By.tagName("a"));
   	    System.out.println(allpage.size());
   	    for(int k =1; k <= allpage.size()-1; k++) {
   	    	JavascriptExecutor jse =  (JavascriptExecutor)driver;
      	     jse.executeScript("scroll(820,7000)");
      	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Next']"))));
   	    	
      	 driver.findElement(By.xpath("//span[text()='Next']")).click();
      	   //allpage.get(k).click();
   	    	
   	    }
   	    
   	  
			
	     
	}

}
