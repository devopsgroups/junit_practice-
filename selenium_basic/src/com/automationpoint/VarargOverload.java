package com.automationpoint;

public class VarargOverload {
	
	
	private void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private void test(String p, String ... args){
        //boolean negate = !p;
        System.out.println("negate = " + p);
        System.out.println("args.length = "+ args.length);
        for (String i: args) {
        	System.out.println("First arg value: " +i);
        }
        //System.out.println("First arg value: " +args[0]);
        //System.out.println("First arg value: " +args[1]);
    }

    public static void main( String[] args ) {
        VarargOverload obj = new VarargOverload();
        obj.test(1, 2, 3);
        obj.test("12345@gmial.com","vvvv","  ");
    }


}
