package dataStructures;

public class ReverseWordStack {
	
	private char[] charArr;
	private int top;
	
	// constructor assigns the length of input string to teh stack
	public ReverseWordStack(String input){
		this.charArr = new char[input.length()]; //assigning input string length
		this.top = -1;
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == charArr.length-1); //to compensate the fact that top is -1 at start
	}
	
	// push char from input to the stack
	public void push(char letter) throws Exception{
		if(this.isFull())
			throw new Exception("Character array is already full");
		charArr[++top] = letter;
		System.out.println(letter+" is inserted");
	}
	
	// pop char from the stack with latest element first
	public char pop() throws Exception{
		char letter;
		if(this.isEmpty())
			throw new Exception("Characted array is Empty");
		letter = charArr[top--];
		System.out.println(letter+" is poped out");	
		return letter;
	}
	
	public static void main(String args[]){
		String input = "ARIZONA";
		String output = "";
		int pointer = 0;
		ReverseWordStack rws = new ReverseWordStack(input);
		try{
			System.out.println("Input is : "+input);
			while(!rws.isFull()){ // push until the stack is full
				rws.push(input.charAt(pointer++));
			}
			while(!rws.isEmpty()){ // pop until stack is empty
				output += rws.pop();
			}
			System.out.println("Output is : "+output); // result of reverseing a string
		}
		catch(Exception ex){
			System.out.println("Error Message : "+ex.getMessage());
		}
	}

}
