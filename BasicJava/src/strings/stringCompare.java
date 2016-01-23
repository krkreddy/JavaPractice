package strings;

import java.util.*;

public class stringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String A;
		String B;
		int i=0;
		
		A=sc.next();
		B=sc.next();
		
//		while(A.charAt(i)!='\r'){
//			System.out.println(A.charAt(i));
//			i++;
//		}
		A.compareTo(B);
//		
		System.out.println(A+" "+B);
		
		System.out.println(A.substring(1, A.length()));
		System.out.println((int)A.charAt(0)+" "+(char)108);

	}

}
