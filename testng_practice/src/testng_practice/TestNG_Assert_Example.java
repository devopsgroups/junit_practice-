package testng_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assert_Example {
	
	//https://blogs.perficient.com/2016/01/13/hard-and-soft-assertions-in-selenium/
	
	String message = "Automation Point";
	  

	   @Test()
	   public void testPrintMessage() {
	      System.out.println("Test 1: Inside testPrintMessage()");
	      message = "AutomationPoint";
	      Assert.assertEquals(message,"AutomationPoint1");
	      System.out.println("Test 1: Checking after Asssertion");
	    
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Test 2:Inside testSalutationMessage()");
	      message = "AutomationPoint";
	      Assert.assertEquals(message,"AutomationPoint");
	      System.out.println("Test 2: Checking after Asssertion");
	   }

	

}
