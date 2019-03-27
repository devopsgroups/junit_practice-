package testng_practice;

import org.testng.annotations.Test;

public class IngnireTestNGTest {
	
	 String message = "Automation Point";
	  

	   @Test(enabled = false)
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = "Manisha";
	      //Assert.assertEquals(message, messageUtil.printMessage());
	    
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Manish";
	      //Assert.assertEquals(message, messageUtil.salutationMessage());
	   }

}
