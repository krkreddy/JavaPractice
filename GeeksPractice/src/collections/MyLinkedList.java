package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class MyLinkedList {
	
	public static void main(String args[]){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("RK");
		ll.add("Praveen");
		ll.add("Ramesh");
		ll.add("Siddu");
		ll.add("Anand");
		
		System.out.println("=== Basic Operations ===");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println();
		
		System.out.println("=== Itartion over LL ===");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
			System.out.print(itr.next());
		System.out.println();
		System.out.println();
		
		System.out.println("=== List to LinkedList ===");
		List<String> list = new LinkedList<String>();
		list.add("Bhardwaj");
		list.add("Amit");
		ll.addAll(list);
		System.out.println(ll);
		System.out.println();
		
		System.out.println("=== Call First Element of List ===");
		System.out.println("First Element : "+ll.element());
		System.out.println("First Element : "+ll.getFirst());
		System.out.println("First Element : "+ll.peek());
		System.out.println("First Element : "+ll.peekFirst());
	}
}
