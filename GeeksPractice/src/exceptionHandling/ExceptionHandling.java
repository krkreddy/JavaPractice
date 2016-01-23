package exceptionHandling;

public class ExceptionHandling {
	
	public static void main(String args[]){
		try{
			for(int i=5; i>=0; i--)
				System.out.println(10/i);
		}
		catch(Exception ex){
			System.out.println("Exception message: "+ex.getMessage());
			//ex.printStackTrace(); // prints the exception as well
		}
		System.out.println("After the loop...");
	}

}
