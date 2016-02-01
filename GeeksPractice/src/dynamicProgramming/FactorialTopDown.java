package dynamicProgramming;

//Not benefited by Dynamic Programming

public class FactorialTopDown {
	private static int[] fac;
	
	public static int fac(int n){
		fac = new int[n+1];
		
		if(n ==0 || n==1)
			return 1;
		fac[0] = 1;
		fac[1] = 1;
		if(fac[n] != 0){
			System.out.println("Returned "+fac[n]);
			return fac[n];
		}
		System.out.println(n+" "+fac[n]);
		return fac[n] = fac(n-1)*n;
	}
	
	public static void main(String args[]){
		System.out.println(fac(5));
		System.out.println(fac(10));
	}

}