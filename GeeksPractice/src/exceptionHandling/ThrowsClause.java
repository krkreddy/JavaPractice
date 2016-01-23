package exceptionHandling;

/**
 * The 'throws' clause in java programming language is belongs to a method to specify that 
 * the method raises particular type of exception while being executed.
 * The 'throws' clause takes arguments as a list of the objects of type 'Throwables' class.
 * Anybody calling a method with a throws clause is needed to be enclosed within the try catch blocks.
 */

public class ThrowsClause {
	
	public static void main(String args[]){
		ThrowsClause tc = new ThrowsClause();
		try{
			for(int i=5;i>=0;i--){
				tc.getJunk();
				System.out.println(i);
			}
		}
		catch(InterruptedException iex){
			iex.printStackTrace();
		}
	}
	
	public void getJunk() throws InterruptedException{
		Thread.sleep(1000);
	}
}
