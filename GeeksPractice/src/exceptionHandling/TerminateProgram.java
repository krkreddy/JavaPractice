package exceptionHandling;

/**
 * An exception is an event, which occurs during the execution of a program, that interrupts the 
 * normal flow of the program. 
 * It is an error thrown by a class or method reporting an error in code.
 * The 'Throwable' class is the superclass of all errors and exceptions in the Java language
 * Exceptions are broadly classified as 'checked exceptions' and 'unchecked exceptions'. 
 * All RuntimeExceptions and Errors are unchecked exceptions. 
 * Rest of the exceptions are called checked exceptions. 
 * Checked exceptions should be handled in the code to avoid compile time errors.
 * Exceptions can be handled by using 'try-catch' block. 
 * Try block contains the code which is under observation for exceptions. 
 * The catch block contains the remedy for the exception. 
 * If any exception occurs in the try block then the control jumps to catch block.
 * If a method doesn't handle the exception, then it is mandatory to specify the 
 * exception type in the method signature using 'throws' clause.
 * We can explicitly throw an exception using 'throw' clause.
 */

public class TerminateProgram {
	
	public static void main(String args[]){
		for(int i=5; i>=0; i--)
			System.out.println(10/i);
		System.out.println("After the loop...");
	}

}
