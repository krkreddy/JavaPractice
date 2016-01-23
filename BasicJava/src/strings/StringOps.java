package strings;

public class StringOps {

	public static void main(String[] args) {
		String myString = "Hello World";
		int myStringLen = myString.length();
		String myStringCase = myString.toUpperCase();
		String myStringReplace = myString.replace('l', 'r');
		int myStringIndex = myString.indexOf('O');
		
		System.out.println(myString);
		System.out.println(myStringLen);
		System.out.println(myStringCase);
		System.out.println(myStringReplace);
		System.out.println(myStringIndex);
	}

}
