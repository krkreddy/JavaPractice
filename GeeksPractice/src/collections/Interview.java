package collections;

import java.util.Iterator;
import java.util.ListIterator;
//import java.util.Map.Entry;
import java.util.Set;

//Java collection frameword interview questions
//+++++++++++++++++++++++++++++++++++++++++++++
//Basic interfaces of java collection framework ?
//Overview of collection framework ?
//Generics in collection framework ?
//What is collection class ?

//Java List interface interview questions
//+++++++++++++++++++++++++++++++++++++++
//What are similarities and difference between ArrayList and Vector ?
//What is difference between Array and ArrayList ?
//What is difference between ArrayList and LinkedList ?

//Java Map interface interview questions
//+++++++++++++++++++++++++++++++++++++++
//Does Map implement Collection framework ? Why ?
//What is difference between HashMap and Hashtable ?
//What is difference between HashMap and HashTree ?

//Java Set interface interview questions
//+++++++++++++++++++++++++++++++++++++++
//What is difference between Set and List ?
//What is difference between HashSet and TreeSet ?

interface Collection<E> extends Iterable<E>{
	int size();
	boolean isEnpty();
	boolean contains(Object paramObject);
	Iterator<E> iterator();
	Object[] toArray();
	boolean add(E paramE);
	boolean remove(Object paramObject);
	boolean containsAll(Collection<?> paramCollection);
	boolean addAll(Collection<? extends E> paramCollection);
	boolean removeAll(Collection<?> paramCollection);
	boolean retainsAll(Collection<?> paramCollection);
	void clear();
	
	boolean equals(Object paramObject);
	int hashCode();
}

// Unique things only - does not allow duplicates
// If obj1.equals(obj2) then only one of them can be in set
interface set<E> extends Collection<E>{
	
}

class HashSet /*implements set*/{
	// unordered unsorted - iterates in random order
	// uses hashCode
}

class LinkedHashSet /*implements set*/{
	// ordered - interates in order of insertion
	// unsorted
	//uses hashCode()
}

class TreeSet /* implements set, NavigableSet*/{
	// sorted set - natural order
	//implements NavigableSet
}


// List of things (allows for duplicates)
// Cares about which position each object is in
// Elements can be added by specifying position
// If position is not specified it is added at the end
interface List<E> extends Collection<E>{
	boolean addAll(int param, Collection<? extends E> paramCollection);
	 E get(int position);
	 E set(int position, E paramE);
	 
	 void add(int position, E paramE);
	 E remove(int paramInt);
	 
	 int indexOf(Object paramObject);
	 int lastIndexOf(Object paramObject);
	 
	 ListIterator<E> iterator();
	 ListIterator<E> iterator(int paramInt);
	 List<E> subList(int paramInt1, int paramInt2);
}

class ArrayList /* implements List<E>, RandomAccess */{
	// implements RandomAccess, a marker interface
	// Insertion and Deletion are slower compared to Lined List
}

class Vector /* implements List<E>, RandomAccess */{
	// Thread Safe - Synchronized Methods
	// implements randomAccess, a marker interface
}

class LinkedList /* implements List<E>, RandomAccess */{
	// elements are doubly linked
	// ideal choice is to implements stack or queue
	// Iteration is slower than ArrayList
	// faster insertion or deletion
	// Implements queue interface also
}


// Arranged in order of processing - a to-do list example
// It support Collection methods
interface Queue<E> extends Collection<E>{
	boolean add(E paramE);
	boolean offer(E paramE);
	E remove();
	E poll();
	E element();
	E peek();
}
 
// Things with unique identifier
// key value pair
// It doesn't expend Collection interface
interface Map<K, V>{
	int size();
	boolean isEmpty();
	
	boolean containsKey(Object paramObject);
	boolean containsvalue(Object paramObject);
	
	V get(Object key);
	V put(K ket, V value);
	V remove(Object key);
	
	void putAll(Map<? extends K,? extends V> paramMap); // copy from other Map
	void clear();
	
	Set<K> keySet();
	Collection<V> values();
	Set<Entry<K,V>> entrySet();
	
	boolean equals(Object paramObject);
	int hashCode();
	
	public static abstract interface Entry<K,V>{
		K getKey();
		V getVaalue();
		V setValue(V paramV);
		boolean equals(Object paramObject);
		int hashCode();
	}
}

class HashMap /* implements Map */{
	// unsorted, unordered
	// Key's HashCode() is used
}

class Hashtable /* implements Map */{
	// Synchronized  - thread safe - version of HashMap
	// unsorted, unordered
	// Key's HashCode() is used
	// HashMap allows a key with null value, Hashtable doesn't
}

class LinkedHashMap /* implements Map, implements NavigableMap */{
	// insertion order is maintained
	// slower insertion and deletion
	// faster iteration
}


public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
