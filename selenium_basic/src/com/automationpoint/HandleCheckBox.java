package com.automationpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		 
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

          WebDriver driver = new ChromeDriver();
          
         //Launch Orange HRM 
		
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// Do login
		         Thread.sleep(2000);
			     driver.findElement(By.id("txtUsername")).sendKeys("admin");			     
			     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		         driver.findElement(By.id("btnLogin")).click();
		         System.out.println("Loged in to Orange HRM");
	
	   // Navigate to Admin module  
			     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
			     System.out.println("Opened user admin page");
			     Thread.sleep(2000);
			     
	 
	  // handle check box
			     
			     
			     if(driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected()) {
			    	 
			    	 System.out.println("check box is selected");
			     }
			     else {
			    	 System.out.println("check box startus: " + driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
			    	 driver.findElement(By.id("ohrmList_chkSelectAll")).click(); 
			    	 System.out.println("check box startus: " + driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
			     }
			     
			     
			   
			     
			     
			     
		

	}

}
