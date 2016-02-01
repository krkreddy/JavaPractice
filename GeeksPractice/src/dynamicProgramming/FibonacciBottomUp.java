package dynamicProgramming;

public class FibonacciBottomUp {
	
	private static int[] fib;
	
	public static int fibNumber(int n){
		fib = new int[n+1];
		
		if(n ==0||n==1) return 1;
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<n+1;i++){
			fib[i] = fib[i-1] + fib[i-2];
			//System.out.println(fib[i]);
		}
		return fib[n];
	}
	
	public static void main(String args[]){
		System.out.println(fibNumber(5));
		System.out.println();
		System.out.println(fibNumber(10));
	}
}