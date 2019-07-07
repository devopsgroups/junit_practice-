package com.selenium.intermediate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseKeyboardFunctionKey {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      Actions act = new Actions(driver);
	      
	      
	      // CTRL + Shift + Click
	      
	      WebElement target = driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"));
	      
	      //act.keyDown(Keys.F12).perform();	
	      
	     // act.sendKeys(Keys.F12).perform();
	      
	      
	      Robot rbt = new Robot();
	      rbt.keyPress(KeyEvent.VK_F12);
	      rbt.keyRelease(KeyEvent.VK_F12);

	}

}
