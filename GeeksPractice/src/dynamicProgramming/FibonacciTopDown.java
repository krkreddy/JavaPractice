package dynamicProgramming;

public class FibonacciTopDown {
	private static int[] fib;
	
	public static int fibNumber(int n){
		fib = new int[n+1];
		
		if(n ==1||n==2) return 1;
		
		if(fib[n] != 0){
			System.out.println("Returned "+fib[n]);
			return fib[n];
		}
		return fib[n] = fibNumber(n-2) + fibNumber(n-1);
	}
	
	public static void main(String args[]){
		System.out.println(fibNumber(5));
		System.out.println();
		System.out.println(fibNumber(10));
	}
}
