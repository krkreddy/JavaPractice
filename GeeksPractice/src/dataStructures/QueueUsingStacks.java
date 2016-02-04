package dataStructures;

public class QueueUsingStacks {
	public static void main(String[] args){
		Stacky stk1 = new Stacky(5);
		Stacky stk2 = new Stacky(5);
		stk1.push(10);
		stk1.push(20);
		stk1.push(30);
		stk1.push(40);
		stk1.push(50);
		System.out.println("== Order As Per Stack ===");
		while(!stk1.isEmpty())
			System.out.print(stk1.pop()+" ");
		System.out.println();
		stk1.push(10);
		stk1.push(20);
		stk1.push(30);
		stk1.push(40);
		stk1.push(50);
		while(!stk1.isEmpty()){
			stk2.push(stk1.pop());
		}
		System.out.println("== Order As Per Queue ===");
		while(!stk2.isEmpty())
			System.out.print(stk2.pop()+" ");
	}
}

class Stacky{
	private int[] stack;
	private int top;
	
	public Stacky(int size){
		stack = new int[size];
		top =-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == stack.length-1;
	}
	
	public int pop(){
		if(isEmpty())
			return -100;
		return stack[top--];
	}
	
	public void push(int value){
		if(isFull())
			System.out.println("Stack is already full");
		else
			stack[++top] = value;
	}
}