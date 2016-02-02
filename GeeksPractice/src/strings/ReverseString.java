package strings;

public class ReverseString {
	
	public static String reverse(String input){
		String output ="";
		int i=input.length();
		while(--i >= 0)
			output += input.charAt(i);
		return output;
	}
	
	public static String reverseByRecursion(String input){
		if(input.length() < 2)
			return input;
		return reverseByRecursion(input.substring(1))+input.charAt(0);
	}
	
	public static void main(String args[]){
		long startTime = System.nanoTime();
		System.out.println(reverse("ramakrishna reddy"));
		System.out.println(reverseByRecursion("jayanth reddy"));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime-startTime)+" ns");
	}

}
