package linkedlist;

public class RevLinkedList {
	private RevNode head;
	
	public RevLinkedList(){
		head = null;
	}
	
	public void insert(RevNode node){
		if(head == null){
			head = node;
			return;
		}
		node.setNext(head);
		head = node;
	}
	
	public void reverse(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		RevNode curr = head.getNext();
		RevNode prev = head, next = null;
		while(curr.getNext() != null){
			if(prev == head)
				prev.setNext(null);
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		curr.setNext(prev);
		head = curr;
	}
	
	public void display(){
		RevNode curr = head;
		if(curr == null){
			System.out.println("List is empty");
			return;
		}
		while(curr != null){
			System.out.print(curr.getData()+" -> ");
			curr = curr.getNext();
		}
		System.out.print(" null\n");
	}
	
	public static void main(String[] args){
		RevLinkedList rll = new RevLinkedList();
		rll.insert(new RevNode(10));
		rll.insert(new RevNode(20));
		rll.insert(new RevNode(30));
		rll.insert(new RevNode(40));
		rll.insert(new RevNode(50));
		rll.insert(new RevNode(60));
		System.out.println("Original List");
		rll.display();
		System.out.println("Reverse List");
		rll.reverse();
		rll.display();
	}

}

class RevNode{
	private int data;
	private RevNode next;
	
	public RevNode(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(RevNode next){
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}
	
	public RevNode getNext(){
		return this.next;
	}
}
