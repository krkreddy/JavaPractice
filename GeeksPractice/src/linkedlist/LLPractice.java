package linkedlist;

public class LLPractice {
	private LNode head;
	
	public LLPractice(){
		head = null;
	}
	
	public void insert(LNode node){
		if(head == null)
			head = node;
		else{
			node.setNext(head);
			head = node;
		}
	}
	
	public void display(){
		LNode curr = head;
		while(curr != null){
			System.out.print(curr.getData()+" -> ");
			curr = curr.getNext();
		}
		System.out.println(" null");
	}
	
	public void printSecondLast(){
		LNode sLast = head;
		if(sLast == null || sLast.getNext() == null)
			System.out.println("Second Last Does Not Exist");
		else{
			while(sLast.getNext().getNext() != null)
				sLast = sLast.getNext();
			System.out.println("Second Last is "+sLast.getData());
		}
	}
	
	public static void main(String[] args){
		LLPractice llp = new LLPractice();
		llp.insert(new LNode(10));
		llp.insert(new LNode(20));
		llp.insert(new LNode(30));
		llp.insert(new LNode(40));
		llp.insert(new LNode(50));
		llp.display();
		llp.printSecondLast();
	}
}

class LNode{
	private int data;
	private LNode next;
	
	public LNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public LNode getNext(){
		return next;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(LNode next){
		this.next = next;
	}
}
