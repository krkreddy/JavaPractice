package HW1;

public class written {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Harty";
		int n = str.length();
		System.out.println(n);
		String mystry = str.substring(0,1)+str.substring(n-1,n);
		System.out.println(mystry);
	}

}
