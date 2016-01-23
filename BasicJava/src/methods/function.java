package methods;

public class function {

	public static void main(String[] args) {
		// main is also a method
		myFirstMethod("Ramakrishna","Reddy");
		System.out.println(add(10,12));
	}
		
	public static void myFirstMethod(String fName, String lName){
		System.out.println("Hello " + fName +" "+ lName);
	}
	
	public static int add(int a, int b){
		return a+b;
	}

}
