package collections;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;


public class MyLLComparator {
	public static void main(String args[]){
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(new Employee("Appu",4000));
		ll.add(new Employee("Shiju",7000));
		ll.add(new Employee("RK",5000));
		ll.add(new Employee("Sattu",9000));
		ll.add(new Employee("Chirag",3000));
		System.out.println("=== Normal Order ===");
		for(Employee emp : ll)
			System.out.println(emp.getName()+"	"+emp.getSalary());
		System.out.println();
		System.out.println("=== Order After Sorting ===");
		Collections.sort(ll,new MySalaryComp());
		for(Employee emp : ll)
			System.out.println(emp.getName()+"	"+emp.getSalary());
		
	}
}

class MySalaryComp implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2){
		if(e1.getSalary() > e2.getSalary())
			return 1;
		else
			return -1;
	}
}

class Employee{	
	private String name;
	private int salary;
	
	public Employee(String name, int salary){
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
		return this.name+" "+this.salary;
	}
}

