package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

public class MyHashtable {
	
	public static void main(String args[]){
		String key;
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("RK", 8);
		ht.put("Jay", 12);
		ht.put("Giri", 9);
		ht.put("Raghu", 15);
		ht.put("Sneha", 4);
		System.out.println("=== Hashtable Demostration ===");
		System.out.println(ht);
		ht.remove("Sneha");
		System.out.println(ht);
		System.out.println();
		
		System.out.println("=== Iterator Demostration ===");
		Set<String> keys = ht.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()){
			key = itr.next();
			System.out.println(key+"	"+ht.get(key));
		}
		System.out.println();
		
		System.out.println("=== Copying Map Content ===");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Siddu", 20);
		hm.put("Sneha", 5);
		ht.putAll(hm);
		System.out.println(ht);
		
	}

}
