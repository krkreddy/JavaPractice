package exceptionHandling;

/**
 * The main usage of finally block is to do clean up job. Keeping cleanup code in a finally 
 * block is always a good practice, even when no exceptions occur. 
 */

public class FinallyBlock {
	
	public static void main(String args[]){
		// Here as the exception occurs both catch and finally block are being executed
		try{
			int i=10/0;
		}
		catch(Exception ex){
			System.out.println("Exception in the 1st block");
		}
		finally{ // executes independent of exception
			System.out.println("Finally in the 1st block");
		}
		// Here as the exception does not occur only finally block is executed executed
		try{
			int i=10/10;
		}
		catch(Exception ex){
			System.out.println("Exception in the 2nd block");
		}
		finally{ // executes independent of exception
			System.out.println("Finally in the 2nd block");
		}
	}

}
