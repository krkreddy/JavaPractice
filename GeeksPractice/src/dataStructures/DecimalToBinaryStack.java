package dataStructures;

// Demostrates the use of StringBuilder over String with implementation of Stack

public class DecimalToBinaryStack {
	
	public static String convertDeciToBin(int value){
		DynamicStack ds = new DynamicStack(5);
		int rem;
//		String result; // this is replaced by StringBuilder
		StringBuilder result=new StringBuilder();
		if(value<0)
			return "Oops It is negative value";
		else if(value==0)
			return "0";
		else{
			while(value>1){
				rem = value%2;
				value /= 2;
				ds.push(rem);
			}
			ds.push(value);
		}
		while(!ds.isEmpty()){
			result.append(ds.pop());
		}
		return result.toString();
	}
	
	public static void main(String args[]){
		System.out.println("Binary value of 10 is : "+convertDeciToBin(10));
		System.out.println("Binary value of 0 is : "+convertDeciToBin(0));
		System.out.println("Binary value of -11 is : "+convertDeciToBin(-11));
		System.out.println("Binary value of 100 is : "+convertDeciToBin(100));
		System.out.println("Binary value of 64 is : "+convertDeciToBin(64));
		System.out.println("Binary value of 81 is : "+convertDeciToBin(81));
	}

}

class DynamicStack{
	private int[] binaryArr;
	private int top;
	
	public DynamicStack(int size){
		binaryArr = new int[size];
		top = -1;
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (binaryArr.length-1 == top);
	}
	
	public void push(int value){
		if(this.isFull())
			this.increaseCapacity();
		binaryArr[++top] = value;
	}
	
	public int pop(){
		return binaryArr[top--];
	}
	
	public void display(){
		int track = top;
		for(int i=track;i>=0;i--)
			System.out.println(binaryArr[track--]);
	}
	
	public void increaseCapacity(){
		int[] newBinaryArr = new int[binaryArr.length*2];
		for(int i=0;i<binaryArr.length;i++)
			newBinaryArr[i] = binaryArr[i];
		binaryArr = newBinaryArr;
	}
	
}
