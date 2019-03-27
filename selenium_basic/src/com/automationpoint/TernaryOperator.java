package com.automationpoint;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//variable x = (expression) ? value if true : value if false
		
		 int a, b;
	      a = 10;
	      b = (a == 1) ? 20: 70;
	      System.out.println( "Value of b is : " +  b );

	      b = (a == 10) ? 100: 30;
	      System.out.println( "Value of b is : " + b );
		
		}

}
