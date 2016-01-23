package HW3;

import java.util.*;

public class ASUGradBank {

	public static void main(String[] args) {
		String name;
		int saving,current,choice,subChoice,amount;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to ASU Grad Bank");
		
		System.out.print("What is your name? ");
		name=scan.nextLine();
		System.out.print("initial deport into Savings: ");
		saving = scan.nextInt();
		System.out.print("initial deport into Current: ");
		current = scan.nextInt();
		
		System.out.print("\nBank Options:\n1. Deposit Money\n2. Withdraw Money\n3. Transfer Money\n4. Quit\n\nYour Choice: ");
		choice = scan.nextInt();
		
		switch(choice){
		case 1: System.out.print("\nDeposit Money Options:\n1. Deposit to Savings\n2. Deposit to Current\n3. Cancel\n\nYour Choice: ");
				subChoice = scan.nextInt();
				switch(subChoice){
				case 1: System.out.print("Amount to be deposited");
						amount = scan.nextInt();
						saving = saving+amount;
						System.out.println("You deposited $"+amount+" to Savings");
						break;
				case 2: System.out.print("Amount to be deposited");
						amount = scan.nextInt();
						current = current+amount;
						System.out.println("You deposited $"+amount+" to Current");
						break;
				case 3: break;
				}
		case 2: System.out.print("\nWithdraw Money Options:\n1. Withdraw from Savings\n2. Withdraw from Current\n3. Cancel\n\nYour Choice: ");
				subChoice = scan.nextInt();
				switch(subChoice){
				case 1: System.out.print("Amount to be withdrawn");
						amount = scan.nextInt();
						saving = saving-amount;
						System.out.println("You withdrew $"+amount+" from Savings");
						break;
				case 2: System.out.print("Amount to be withdrawn");
						amount = scan.nextInt();
						current = current-amount;
						System.out.println("You withdrew $"+amount+" from Current");
						break;
				case 3: break;
				}
		case 3: System.out.print("\nTransfer Money Options:\n1. Transfer from Checking to Savings\n2. Transfer from Savings to Checking\n3. Cancel\n\nYour Choice: ");
				subChoice = scan.nextInt();
				switch(subChoice){
				case 1: System.out.print("Amount to transfer from Current to Savings: ");
					amount = scan.nextInt();
					saving = saving-amount;
					current = current+amount;
					System.out.println("Amount transfered from Current to Savings: "+amount);
					break;
				case 2: System.out.print("Amount to transfer from Savings to Current: ");
					amount = scan.nextInt();
					current = current-amount;
					saving = saving+amount;
					System.out.println("Amount transfered from Savings to Current: "+amount);
					break;
				case 3: break;
				}
		case 4: break;
		}
		scan.close();
		System.out.println(name+"'s Account Balance is $"+(saving+current)+"(S:$"+saving+", C:$"+current+")");
	}

}
