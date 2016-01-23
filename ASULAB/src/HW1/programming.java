package HW1;

import java.util.*;

public class programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int feet;
		int inches;
		double height;
		System.out.println("What is your name?");
		name=sc.next();
		System.out.print("What is your height?\nFeets: ");
		feet=sc.nextInt();
		System.out.print("Inches: ");
		inches=sc.nextInt();
		height= ((feet*12)+inches)*2.54/100;
		System.out.println(name+", your height in metres is: "+height);
		sc.close();
	}

}
