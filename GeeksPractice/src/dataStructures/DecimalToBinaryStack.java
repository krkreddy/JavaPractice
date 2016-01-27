package dataStructures;

public class DecimalToBinaryStack {
	
	public static void main(String args[]){
		DynamicStack ds = new DynamicStack(5);
		
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
