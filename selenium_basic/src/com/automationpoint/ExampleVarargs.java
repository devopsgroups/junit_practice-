package com.automationpoint;

public class ExampleVarargs {

	//https://stackoverflow.com/questions/965690/java-optional-parameters
	
	public static void main(String[] args) {
		ExampleVarargs f  = new ExampleVarargs();
		f.foo("a", 5,100000);
     
	}
	
//	void foo(String a, Integer b) {
//	    System.out.println("String value : " + a + "and Value of integer : " + b );
//	}
//	
	//a) All optional parameters are of the same type:
	
	void foo(String a, Integer... b) {
	    Integer b1 = b.length > 0 ? b[0] : 0;
	    Integer b2 = b.length > 1 ? b[1] : 0;
	    
	    System.out.println("Value : " + a + " At index one :  "+ b1 +"  At index two : "+ b2);
	    //...
	}
	
	//Types of optional parameters may be different:
	
	void foo(String a, Object... b) {
	    Integer b1 = 0;
	    String b2 = "";
	    if (b.length > 0) {
	        if (!(b[0] instanceof Integer)) { 
	            throw new IllegalArgumentException("...");
	        }
	        b1 = (Integer)b[0];
	      } if (b.length > 1) {
	          if (!(b[1] instanceof String)) { 
	              throw new IllegalArgumentException("...");
	          }
	          b2 = (String)b[1];
	          //...
	      }
	      //...
	      
	}
	

}
