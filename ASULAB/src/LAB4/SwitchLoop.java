package LAB4;

/**
 * Program to prompt the Menu options until the user chosses to quit
 */

import java.util.*;

public class SwitchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Please choose your choice from the following menu:");
			System.out.println("1) Calculate the sum of 1 to m integers");
			System.out.println("2) Calculate the factorial of given number");
			System.out.println("3) Quit");
		
			choice = scan.nextInt();
			if(choice>3 || choice<1){
				System.out.println(choice+" is not a valid choice");
			}
			else{
				switch(choice){
				case 1:
					int m;
					int sum=0;
					System.out.println("Enter the value of m");
					m = scan.nextInt();
					for(int i=1;i<=m;i++) sum+=i;
					System.out.println("Sum of "+m+" intergers is: "+sum+"\n");
					break;
				case 2:
					int n;
					int rum=1;
					System.out.println("Enter the value of m");
					n = scan.nextInt();
					for(int i=1;i<=n;i++) rum*=i;
					System.out.println("Factorial of "+n+" is: "+rum+"\n");
					break;
				case 3:
					System.out.println("Thank You. Good Bye !!\n");
					break;
				}
			}
		}while(choice!=3);

	}

}
