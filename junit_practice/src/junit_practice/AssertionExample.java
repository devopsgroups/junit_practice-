package junit_practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionExample {

	@Test
	public void testAssertions() {

		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		// Check that two objects are equal
	    assertEquals(str1, str2);
		System.out.println("Checked that two objects are equal ");
		

		// Check that a condition is true
		assertTrue(val1 < val2);
		System.out.println("Checked that a condition is true");
		
		// Check that a condition is false
		assertFalse(val1 > val2);
		System.out.println("Checked that a condition is false");
		
		// Check that an object isn't null
		assertNotNull(str1);
		System.out.println("Checked that an object isn't null");
		
		// Check that an object is null
		assertNull(str3);
		System.out.println("Check that an object is null");

		// Check if two object references point to the same object
		assertSame(str4, str5);
		System.out.println("Checked if two object references point to the same object");
		
		// Check if two object references not point to the same object
		assertNotSame(str1, str3);
		System.out.println("Checked if two object references not point to the same object");

	}

}
