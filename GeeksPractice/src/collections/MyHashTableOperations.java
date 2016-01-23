package collections;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Enumeration;

public class MyHashTableOperations {
	
	public static void main(String args[]){
		String tracker;
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("India","New Delhi");
		ht.put("USA","New York");
		ht.put("UK","London");
		ht.put("Australia","Sydney");
		System.out.println("=== Hashtable Demostration ===");
		System.out.println(ht);
		System.out.println();
		
		System.out.println("=== Hashtable Operations ===");
		System.out.println("Whether Hashtable conatins India :"+ht.containsKey("India"));
		System.out.println("Whether Hashtable conatins Sydney: "+ht.containsValue("Sydney"));
		// Set of keys in Hashtable
		Set<String> keys = ht.keySet();
		System.out.print("List of Keys in Hashtable is: ");
		for(String key:keys)
			System.out.print(key+"  ");
		System.out.println();
		// Entry sets of the Hashtable
		Set<Entry<String,String>> entries = ht.entrySet();
		System.out.println("Enrty Sets of Hashtable are: ");
		for(Entry<String,String> entry: entries)
			System.out.println("	"+entry.getKey()+" => "+entry.getValue());
		System.out.println();
		
		System.out.println("=== Enumeration over hashtable ===");
		Enumeration<String> enumerate = ht.keys();
		while(enumerate.hasMoreElements()){
			tracker = enumerate.nextElement();
			System.out.println(tracker+" => "+ht.get(tracker));
		}
			
	}
}
