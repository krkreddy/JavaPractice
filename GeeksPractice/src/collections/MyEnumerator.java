package collections;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumerator {
	
	public static void main(String args[]){
		Vector<String> vec = new Vector<String>();
		vec.add("RK");
		vec.add("Raghu");
		vec.add("Sneha");
		vec.add("Jay");
		
		Enumeration<String> enmr = vec.elements();
		while(enmr.hasMoreElements())
			System.out.println(enmr.nextElement());
	}

}
