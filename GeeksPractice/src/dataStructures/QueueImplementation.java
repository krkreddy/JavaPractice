package dataStructures;

public class QueueImplementation {
	private int[] queue;
	private int front = -1;
	private int rare = -1;
	
	public QueueImplementation(int size){
		queue = new int[size];
	}
	
	public boolean isEmpty(){
		return (front == -1 && rare == -1);
	}
	
	public boolean isFull(){
		return (rare == queue.length);
	}
	
	public void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is already full");
		}
		else if(isEmpty()){
			front = 0;
			rare = 0;
		}
		else{
			rare += 1;
		}
		queue[rare] = data;
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("No one present in the queue");
		}
		else if(front == rare){
			front = -1;
			rare = -1;
		}
		else{
			front += 1;
		}
	}
	
	public void display(){
		int track = front;
		while(track <= rare){
			System.out.print(queue[track]+" ");
			track++;
		}
	}
	
	public static void main(String args[]){
		QueueImplementation Q = new QueueImplementation(5);
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		Q.dequeue();
		Q.display();
	}
}
