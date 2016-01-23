package exceptionHandling;

/**
 * Use 'throw' statement to throw an exception or simply use the throw clause with an object 
 * reference to throw an exception. The syntax is 'throw new Exception();'. 
 * Even you can pass the error message to the Exception constructor.
 */

public class ThrowClause {
	
	public static void main(String args[]){
		ThrowClause tc = new ThrowClause();
		try{
			System.out.println("Length of JUNK is "+tc.getStringLen("JUNK"));
			System.out.println("Length of WRONG is "+tc.getStringLen("WRONG"));
			System.out.println("Length of NULL is "+tc.getStringLen(null));
		}
		catch(Exception ex){
			//ex.printStackTrace(); //Prints the complete error message
			System.out.println("Exception Message :"+ex.getMessage());
		}
	}
	
	public int getStringLen(String input) throws Exception{
		if(input == null)
			throw new Exception("It is an empty String");
		return input.length();
	}

}
