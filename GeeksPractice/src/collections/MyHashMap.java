package collections;

import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
	
	public static void main(String args[]){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("US", "ASU");
		hm.put("UK", "LBS");
		hm.put("India", "IIT");
		System.out.println(hm);
		System.out.println("Value of India is :"+hm.get("India"));
		System.out.println("Whether HM contain Aus :"+hm.containsKey("Aus"));
		System.out.println("List of all keys :"+hm.keySet()); // assign it to Set<String> keys
		
		// Iterator functionality
		System.out.println("=== Iterator functionality ===");
		Set<String> keys = hm.keySet();
		for(String key : keys)
			System.out.println(key+" => "+hm.get(key));
		
	}

}
