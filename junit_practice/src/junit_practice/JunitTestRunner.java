package junit_practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestJunit.class,
	//FirstSeleniumTestCodeWithJunit.class,
	AssertionExample.class,
	AnnotationExample.class,
	IgnoreAnootationExample.class
})
public class JunitTestRunner {

	
	
}
