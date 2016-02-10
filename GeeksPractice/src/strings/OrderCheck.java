package strings;

public class OrderCheck {
	
	public static boolean checkOrder(String main,String sample){
		int track=0;
		for(int i=0;i<sample.length();i++){
			for(int j=track;i<main.length();j++){
				if(sample.charAt(i) == main.charAt(j)){
					if(i == sample.length()-1)
						return true;
					else if(j == main.length()-1)
						return false;
					track = j+1;
					break;
				}
				else{
					if(j == main.length()-1)
						return false;
					track = j+1;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		String str1 = "abcNjAhNgAhGjhfhAljhRkhgRbhjbevfhO";
		String str2 = "NAGARRO";
		System.out.println(checkOrder(str1,str2));
	}
}
