package strings;

import java.util.StringTokenizer;

public class RemoveMultipleSpaces {
	
	public static void main(String args[]){
		String str = "Remove     Multiple     Spaces";
		String strOut = "";
		int limit=0;
		System.out.println("input string is : "+str);
		
		// Method 1 to remove spaces
		System.out.println("=== Method 1 ===");
		for(int i=0;i<str.length();i++){
			//System.out.println(str.charAt(i));
			if(str.charAt(i) == ' ')
				limit+=1;
			else
				limit =0;
			if(limit>1);
			else
				strOut = strOut+str.charAt(i);
		}
		System.out.println("output string is : "+strOut);
		
		// Method 2 to remove spaces
		System.out.println("=== Method 2 ===");
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements())
			sb.append(st.nextElement()).append(" ");
		System.out.println("output string is : "+sb.toString().trim());
	}

}
