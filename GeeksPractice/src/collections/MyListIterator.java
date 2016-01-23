package collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class MyListIterator {
	
	public static void main(String args[]){
		List<String> myList = new ArrayList<String>();
		myList.add("RK");
		myList.add("Giri");
		myList.add("Raghu");
		myList.add("SnehaGaru");
		myList.add("Jay");
		
		ListIterator<String> litr = myList.listIterator();
		System.out.println("== Forward Iteration ==");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("\n== Backward Iteration ==");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		System.out.println("\n== Printing the current index ==");
		System.out.println(litr.previousIndex());
		System.out.println(litr.nextIndex());
		
	}
}
