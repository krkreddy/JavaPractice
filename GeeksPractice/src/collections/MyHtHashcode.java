package collections;

import java.util.Hashtable;

public class MyHtHashcode {
	
	public static void main(String args[]){
		Hashtable<Student,String> ht = new Hashtable<Student,String>();
		ht.put(new Student("CSE",3.9), "RK");
		ht.put(new Student("CNE",3.9), "Raghu");
		ht.put(new Student("SE",3.8), "Jay"); 
		ht.put(new Student("SE",3.9), "Giri"); // Jay's parameters get overridden by Giri
		ht.put(new Student("IT",3.6), "Sneha");
		System.out.println(ht);
		// Below duplicate entry is included before equals method is Overridden
		ht.put(new Student("IT",3.6), "Sneha");
		System.out.println(ht);
	}
}

class Student{
	String branch;
	double gpa;
	
	public Student(String branch,double gpa){
		this.branch = branch;
		this.gpa = gpa;
	}
	
	public String getBranch(){
		return this.branch;
	}
	
	public double getGpa(){
		return this.gpa;
	}
	
	public String toString(){
		return this.branch+"-->"+this.gpa;
	}
	
	// Overriding the hashCode method of Object class 
	public int hashCode(){
		System.out.println("In HashCode");
		int scale = (int)gpa*25;
		return scale; 
	}
	
	// Overriding the equals method in Object class
	public boolean equals(Object obj){
		Student s = null;
		if(obj instanceof Student)
			s = (Student)obj;
		System.out.println("In Equals");
		if(this.getBranch().equals(s.getBranch()))
			return true;
		else
			return false;
	}
	
}
