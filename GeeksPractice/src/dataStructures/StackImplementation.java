package dataStructures;

public class StackImplementation {
	
	private int stackSize;
	private int[] stack;
	private int top;
	
	public StackImplementation(int size){
		this.stackSize = size;
		this.stack = new int[size];
		this.top = -1;
	}
	
	public boolean isStackEmpty(){
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return (top == stackSize-1);
	}
	
	public void push(int input) throws Exception{
		if(this.isStackFull())
			throw new Exception("Stack is already full");
		else
			this.stack[++top] = input;
		System.out.println("Adding :"+input);
	}
	
	public int pop() throws Exception{
		if(this.isStackEmpty())
			throw new Exception("Stack is empty ");
		int entry = this.stack[top--];
		System.out.println("Removing :"+entry);
		return entry;
	}
	
	public static void main(String args[]){
		StackImplementation si = new StackImplementation(5);
		try{
			si.push(2);
			si.push(4);
			si.push(6);
			si.pop();
			si.push(8);
			si.push(10);
			si.push(12);
			si.push(14);
			si.push(16);
		}
		catch(Exception ex){
			System.out.println("Error message :"+ex.getMessage());
		}
		try{
			si.pop();
			si.pop();
			si.pop();
			si.pop();
			si.pop();
			si.pop();
		}
		catch(Exception ex){
			System.out.println("Error message :"+ex.getMessage());
		}
	}

}
