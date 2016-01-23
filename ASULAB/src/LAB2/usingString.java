package LAB2;

import java.util.*;

public class usingString {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String userName;
		System.out.println("Please enter your first and last name: ");
		userName = scan.nextLine();
		System.out.println("Length of name: "+userName.length());
		System.out.println("Case conversions: "+userName.toLowerCase());
		System.out.println("Character at position 1: "+userName.charAt(1));
		System.out.println("Sub string from username: "+userName.substring(0,3));
		System.out.println("Equality using comare to: "+userName.compareTo("reddy"));
		System.out.println("Equality using equal to: "+userName.equals("Reddy"));
		System.out.println("Equality ignoring case: "+userName.equalsIgnoreCase("Reddy"));
		System.out.println("Position of red: "+ userName.indexOf("red"));
		
	}
}
