package junit_practice;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestJunit.class, AssertionExample.class,AnnotationExample.class);
		// Result result = JUnitCore.runClasses(TestJunit.class);
	    /*  for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());*/
	   }

}


