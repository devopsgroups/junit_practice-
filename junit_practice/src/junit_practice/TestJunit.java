package junit_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestJunit {

  @Test()
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
		System.out.println("Checked the assert");
	}

}
