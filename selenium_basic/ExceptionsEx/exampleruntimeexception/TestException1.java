package exampleruntimeexception;

public class TestException1 {

	public static void main(String[] args) {
		
		   try{  
			    validate(12);  
			    
			  }catch(Exception e){
				  
				  System.out.println("Exception occured: "+e);
				  System.out.println("Value of stack trace "  + e.getStackTrace());				  
				   RuntimeException ex = new RuntimeException("Checking runtime exception here  " + e.getMessage());
					ex.setStackTrace(e.getStackTrace());
					
					throw ex;
				  
			    	  
			    	 }  
			  
			      
		   
		   System.out.println("rest of the code...");  
			  }  
	
	
	

	

	static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid age for ");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	
	
	
	
}
