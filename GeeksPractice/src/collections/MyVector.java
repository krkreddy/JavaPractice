package collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class MyVector {
	
	public static void main(String args[]){
		Vector<String> vec = new Vector<String>();
		vec.add("RK");
		vec.add("Pankaj");
		vec.add("Chinmay");
		vec.add("Raju");
		
		System.out.println("=== Basic Operations ===");
		System.out.println(vec);
		System.out.println("Element at index 2 is "+vec.get(2));
		System.out.println("Is the list empty "+vec.isEmpty());
		System.out.println();
		
		System.out.println("=== Iteration ===");
		Iterator<String> itr = vec.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" -- ");
		System.out.print("EOL\n\n");
		
		System.out.println("=== Enumeration ===");
		Enumeration<String> enm = vec.elements();
		while(enm.hasMoreElements())
			System.out.print(enm.nextElement()+" -- ");
		System.out.print("EOL\n\n");
	}
}
