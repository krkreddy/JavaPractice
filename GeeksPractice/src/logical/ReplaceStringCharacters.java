package logical;

public class ReplaceStringCharacters {
	
	public static String replaceString(String input, char letter, char newLetter){
		String output = "";
		int index;
		while(input.indexOf(letter) > 0){
			index = input.indexOf(letter);
			// Brute force
			//output = input.substring(0, index)+newLetter+input.substring(index+1,input.length());
			//input = output;
			output = output + input.substring(0,index)+newLetter; // O(n) algorithm
			input = input.substring(index+1,input.length());
		}
		output = output + input;
		return output;
	}
	
	public static void main(String[] args){
		long startTime = System.nanoTime();
		System.out.println(replaceString("Ramakrishna",'a','z'));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}

}
