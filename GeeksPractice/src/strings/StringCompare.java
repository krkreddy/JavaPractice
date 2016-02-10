package strings;

public class StringCompare {
	
	public static boolean checkPresence(String[] input, String check){
		for(int i=0;i<input.length;i++){
			if(check.compareTo(input[i]) == 0)
				return true;
		}
		return false;
	}
	
	public static int checkCharDiff(String[] input, String check){
		int count = 0;
		for(int i=0;i<input.length;i++){
			if(diffValue(input[i],check) == 1){
				count += 1;
				System.out.println(input[i]);
			}
		}
		return count;
	}
	
	public static int diffValue(String s1, String s2){
		int i=0,j=0;
		int count = 0;
		if(s1.length() != s2.length())
			return -1;
		while(i<s1.length() && j<s2.length()){
			if(s1.charAt(i) != s2.charAt(j)){
				count += 1;
			}
			i++;
			j++;
		}
		return count;
	}
	
	public static void main(String[] args){
		String[] str = {"bana","appale","banaba","bananb","bonana","banamf"};
		String check = "banana";
		System.out.println(checkPresence(str, check));
		System.out.println(checkCharDiff(str, check));
	}

}
