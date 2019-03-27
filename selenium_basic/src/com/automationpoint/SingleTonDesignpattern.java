package com.automationpoint;

public class SingleTonDesignpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj1 = ABC.getInstance();
		
		
	}

}

class ABC{
	
	
	static ABC  obj = new ABC();
	private ABC()
	{
		
	}
	
	public static ABC getInstance() {
		
		return obj ;
	}
}