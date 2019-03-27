package assert_practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	@Test
	public void test1(){
	SoftAssert sa= new SoftAssert();
	sa.assertTrue(2<1);
	System.out.println("Assertion Failed");
	sa.assertFalse(1<2);
	System.out.println("Assertion Failed");
	sa.assertEquals("Sample","Failed");
	System.out.println("Assertion Failed");
	}

}
