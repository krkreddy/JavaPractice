package dataStructures;

public class QueueCircularArray {
	private int[] queue;
	private int front = -1;
	private int rear = -1;
	
	public QueueCircularArray(int size){
		queue = new int[size];
	}
	
	public boolean isEmpty(){
		return (front == -1 && rear == -1);
	}
	
	public boolean isFull(){
		return ((rear+1)%queue.length == front);
	}
	
	public void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is already full. Cannot insert "+data);
		}
		else if(isEmpty()){
			front = 0;
			rear = 0;
			queue[rear] = data;
		}
		else{
			rear = (rear+1)%queue.length;
			queue[rear] = data;
		}
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("No one present in the queue");
		}
		else if(front == rear){
			front = -1;
			rear = -1;
		}
		else{
			front = (front+1)%queue.length;
		}
	}
	
	public void display(){
		int track = front-1;
		do{
			track = (track+1)%queue.length;
			System.out.print(queue[track]+" ");
		}while(track != rear);
	}
	
	public static void main(String args[]){
		QueueCircularArray Q = new QueueCircularArray(5);
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		Q.dequeue();
		Q.dequeue();
		Q.enqueue(60);
		Q.enqueue(70);
		Q.enqueue(60);
		Q.enqueue(80);
		Q.display();
	}
}