package com.selenium.intermediate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserCeationDeletion {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		// Do login
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
       
	      driver.findElement(By.id("btnLogin")).click();
	     
	     // Click on menu  
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    
	    
	     driver.findElement(By.id("btnAdd")).click();
	     
	     // Create User
	     
	     WebElement dddown =  driver.findElement(By.id("systemUser_userType"));
	    
	     Select dropdown  = new  Select(dddown);
	     dropdown.selectByIndex(1);
	     driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("John Smith");
	    
	     driver.findElement(By.id("systemUser_userName")).sendKeys("testing.user12");
	     
	     WebElement dddown1 =  driver.findElement(By.id("systemUser_status"));
		    
	     Select dropdown1  = new  Select(dddown1);
	     
	     dropdown1.selectByIndex(1);
	     driver.findElement(By.id("systemUser_password")).sendKeys("testingser12");
	     driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("testingser12");
	     
		    
	     driver.findElement(By.id("btnSave")).click();
	     
	     
	   /*  
	     List<WebElement> username = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr/td[2]/a"));
	     
	     for(int i = 0; i<= username.size()-1 ; i++  ){
	    	 
	    	 if(username.get(i).getText().equals("john.smith")){
	    		 
	    		 username.get(i).click();
	    	 }
	    	 
	     }
	     
	     
	     
	     System.out.println(username.size());
	     
	     username.get(2).click();
	     
	     
*/
	}

}
