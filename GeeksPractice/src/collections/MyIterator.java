package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
	
	public static void main(String args[]){
		
		String remEle = "Jay";
		List<String> myList = new ArrayList<String>();
		myList.add("RK");
		myList.add("Jay");
		myList.add("Giri");
		myList.add("Raghu");
		myList.add("SnehaGaru");
		Iterator<String> itr = myList.iterator();
		
		System.out.println("\n== Before removing one element ==\n");
		System.out.println(myList);
		
		while(itr.hasNext()){
			if(remEle.equals(itr.next()))
				itr.remove();
		}
		
		System.out.println("\n== After removing one element ==\n");
		System.out.println(myList);
		
	}

}
