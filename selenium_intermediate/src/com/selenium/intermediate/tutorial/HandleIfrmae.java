package com.selenium.intermediate.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIfrmae {
	
     /*	
       <body>
         <div class="box">
          <iframe name="iframe1" id="IF1" height="600" width="400" src="http://autoamtionpoint.com"></iframe>
         </div>
        <div class="box">
          <iframe name="iframe2" id="IF2" height="600" width="400" align="left" src="http://autoamtionpoint.com"></iframe>
        </div>
      </body>
	
	*/
   public static void main(String[] args) {
		
		 // Steps to launch Chrome Browser
		  
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	     // Launch application 
	      driver.get("https://jqueryui.com/droppable/");
	      
	      
	     // driver.switchTo().frame();
	      
	      System.out.println( driver.findElement(By.xpath("//div[@id='draggable']")).getText());
	      
	      
	      
	     
	      
             
	    
	}

}
