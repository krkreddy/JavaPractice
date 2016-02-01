package dynamicProgramming;

//Not benefited by Dynamic Programming

public class FactorialBottomUp {
	
	private static int[] fac;
	
	public static int fac(int n){
		fac = new int[n+1];
		int sum=1;
		
		if(n ==0 || n==1)
			return 1;
		fac[0] = 1;
		fac[1] = 1;
		for(int i=2;i<n+1;i++){
			sum *= i;
			fac[i] = sum;
			//System.out.println(i+" "+fac[i]);
		}
		return fac[n];
	}
	
	public static void main(String args[]){
		System.out.println(fac(5));
		System.out.println(fac(10));
	}

}
