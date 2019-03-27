package com.automationpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCheckBoxradiButtonDropDown {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// Do login
		         Thread.sleep(2000);
			     driver.findElement(By.id("txtUsername")).sendKeys("admin");
			     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		         driver.findElement(By.id("btnLogin")).click();
		         System.out.println("Loged in to Orange HRM");
	
	   // Navigate to User creation page  
			     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
			    // driver.findElement(By.id("btnAdd")).click();
			     System.out.println("Opened user creation page");          
	
			     
	   // Handle check box	
			     if(!driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected()) {
			    	 System.out.println("isSelected: "+driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
			    	 driver.findElement(By.id("ohrmList_chkSelectAll")).click();
			    	 System.out.println("checked box is selected by script");
			    	 System.out.println("isSelected: "+driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
			     } 
			     else {
//			    	 System.out.println("isSelected: "+driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
//			    	 driver.findElement(By.id("ohrmList_chkSelectAll")).click();
//			    	 System.out.println("checked box is selected by script");
//			    	 System.out.println("isSelected: "+driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected());
			     }
			     
			     
					
					driver.get("https://www.facebook.com/");
					
					 // Handle radio check box	
				     if(driver.findElement(By.id("u_0_9")).isSelected()) {
				    	 System.out.println("check box is selected");
				     } 
				     else {
				    	 Thread.sleep(8000);
				    	 System.out.println("isSelected radio check: "+driver.findElement(By.id("u_0_9")).isSelected());
				    	 driver.findElement(By.id("u_0_9")).click();
				    	 //System.out.println("u_0_9");
				    	 System.out.println("isSelected radio check: "+driver.findElement(By.id("u_0_9")).isSelected());
				     }
				     
				     
				     // Handle drop down using selenium	
				     WebElement day = driver.findElement(By.id("day")); 
				     Select  dpd = new Select(day);
				     dpd.selectByVisibleText("10");
				     System.out.println(dpd.isMultiple());
				    // dpd.deselectByVisibleText("10");
				    // dpd.deselectAll();
				     
				     }

}
