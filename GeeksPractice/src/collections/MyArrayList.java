package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
	
	public static void main(String arga[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("=== Basic Operations ===");
		System.out.println(al);
		al.add(2,60);
		al.add(50);
		System.out.println(al);
		System.out.println("Element at indes 2 is "+al.get(2));
		System.out.println("Does list contains 40 "+al.contains(40));
		System.out.println("Index of 50 is "+al.indexOf(50));
		System.out.println();
		
		// Using Iterator
		System.out.println("=== Iterator Demostraion ===");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println();
		System.out.println();
		
		// copying of arraylist
		System.out.println("=== ArrayList copying ===");
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.addAll(al);
		System.out.println(list);
		System.out.println("SubList of list is "+list.subList(2, 5));
	}
}
