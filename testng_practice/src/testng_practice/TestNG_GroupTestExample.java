package testng_practice;

import org.testng.annotations.Test;

public class TestNG_GroupTestExample {
	
	 String message = ".com";
	   

	   @Test(groups = { "functest", "checkintest" })
	   
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = ".com";
	     
	   }

	   @Test(groups = { "checkintest" })
	   
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "AutomationPoint" + ".com";
	      
	   }

	   @Test(groups = { "functest" })
	   
	   public void testingExitMessage() {
	      System.out.println("Inside testExitMessage()");
	      message = "www." + "AutomationPoint"+".com";
	      
	   }  

}
