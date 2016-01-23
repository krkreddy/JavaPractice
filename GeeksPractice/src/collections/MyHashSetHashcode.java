package collections;

import java.util.HashSet;

public class MyHashSetHashcode {
	
	public static void main(String args[]){
		HashSet<Company> hs = new HashSet<Company>();
		hs.add(new Company("Amazon",7000));
		hs.add(new Company("Intel",6000));
		hs.add(new Company("Mathworks",4000));
		hs.add(new Company("Google",9000));
		hs.add(new Company("ASU",3000));
		System.out.println(hs);
		hs.add(new Company("ASU",3500));
		hs.add(new Company("Google",9000));
		System.out.println(hs);
	}
}

class Company{
	String name;
	int salary;
	
	public Company(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public String toString(){
		return this.name+" --> "+this.salary;
	}
	
	// Overriding the hashcode method in Object class
	public int hashCode(){
		System.out.println("In HashCode");
		return salary;
	}
	
	// Overriding the equals method in Object class
	public boolean equals(Object obj){
		Company c = null;
		if(obj instanceof Company)
			c = (Company)obj;
		if(this.getName() == c.getName())
			return true;
		else
			return false;
	}
}
