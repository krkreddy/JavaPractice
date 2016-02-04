package logical;

// Logic needs to be modified for other test cases by sorting rest of the digits

public class NextGreatestNum {
	
	public static String nextGreatest(int num){
		int pos=0;
		String output = "";
		boolean check = false;
		String str = Integer.toString(num);
		for(int i=str.length()-1;i>=0;i--){
			if(i==0){
				return "not possible";
			}
			if(str.charAt(i) > str.charAt(i-1)){
				pos = i-1;
				output = str.substring(0,pos);
				break;
			}
		}
		output += str.charAt(str.length()-1);
		for(int i=str.length()-2;i>pos;i--){
			System.out.println(output);
			if(str.charAt(pos) < str.charAt(i) && !check){
				output += str.charAt(pos);
				i++;
				check = true;
			}
			else
				output += str.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args){
		int num = 1234;
		String result = nextGreatest(num);
		System.out.println(result);
	}

}
