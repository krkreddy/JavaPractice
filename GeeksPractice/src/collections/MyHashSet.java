package collections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		System.out.println("=== Basics Demostration ===");
		System.out.println(hs);
		System.out.println("Size of HashSet is : "+hs.size());
		System.out.println("Does HashSet contains first : "+hs.contains("first"));
		System.out.println();
		
		System.out.println("=== Iterator Over HashSet ===");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println("\n");
		
		System.out.println("=== Compare Two HashSets===");
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("second");
		subSet.add("fourth");
		subSet.add("rat");
		hs.retainAll(subSet);
		System.out.println(hs);
	}

}
