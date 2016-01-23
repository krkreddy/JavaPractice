package scanner;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter some number");
		
		int user_input_number;
		user_input_number = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter some string");
		
		String user_input_string;
		user_input_string = scan1.nextLine();
		
		System.out.println("Entered value is " + user_input_number);
		System.out.println("Entered value is " + user_input_string);
	}
}
