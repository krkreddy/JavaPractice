package HW4;

/**
 * 
 * @author Ramakrishna
 * Drawing a pattern.. back to college
 *
 */

import java.util.*;

public class TreePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String choice;
		int selection;
		
		do{
			System.out.println("Choose one of the following:");
			System.out.println("1. Generate a multiplication table");
			System.out.println("2. Display a pattern of stars and character ‘o’");
			System.out.print("Your Choice: ");
		
			selection = scan.nextInt();
			
			switch(selection){
				case 1:
					int num=-1;
					int tableSize=1;
					while(num<0 || tableSize<0){
						System.out.println("Please enter a number and tablesize: ");
						num = scan.nextInt();
						tableSize = scan.nextInt();
					}
					for(int i=1;i<=tableSize;i++){
						System.out.println(i+" * "+num+"\t=\t"+i*num);
					}
					System.out.println("\n");
					break;
				case 2:
					int rows=0;
					while(rows<1){
						System.out.print("Please enter number of rows: ");
						rows = scan.nextInt();
					}
					for(int i=rows;i>0;i--){
						for(int j=i-1;j>0;j--){
							System.out.print(" ");
						}
						for(int j=rows-i+1;j>0;j--){
							System.out.print("*");
							if(j!=1)System.out.print("o");
						}	
						System.out.println();
					}
					System.out.println("\n");
					break;			
			}
			
			
			System.out.println("Do you wish to continue(Yes/No): ");
			choice = scan.next();
			System.out.println(choice);
			if(choice.toLowerCase().equals("no")) System.out.println("Thank you for your time !!");
		}while(choice.toLowerCase().equals("yes"));

	}

}
