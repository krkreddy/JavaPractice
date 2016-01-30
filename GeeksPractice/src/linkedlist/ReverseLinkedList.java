package linkedlist;

public class ReverseLinkedList {
	RevListNode headNode;
	
	public ReverseLinkedList(){
		headNode = null;
	}
	
	public void insertNode(RevListNode node){
		if(headNode == null)
			headNode = node;
		else{
			node.setNext(headNode);
			//headNode.setNext(node);  // guess what will happen here
			headNode = node;
		}
	}
	
	public void displayList(){
		RevListNode currNode = headNode;
		while(currNode != null){
			System.out.print(currNode.getData()+" -> ");
			currNode = currNode.getNext();
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void reverseList(){
		RevListNode curr = headNode.getNext();
		RevListNode next, prev = headNode ;
		while(curr.getNext() != null){
			if(prev == headNode){
				prev.setNext(null);
			}
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
			if(next.getNext() == null){
				next.setNext(prev);
				headNode = next;
				break;
			}
			else{
				next = next.getNext();
			}
		}
	}
	
	public static void main(String args[]){
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.insertNode(new RevListNode(10));
		rll.insertNode(new RevListNode(20));
		rll.insertNode(new RevListNode(30));
		rll.insertNode(new RevListNode(40));
		rll.insertNode(new RevListNode(50));
		rll.insertNode(new RevListNode(60));
		System.out.println("ACTUAL ORDER OF NODES");
		rll.displayList();
		System.out.println("REVERSE ORDER OF NODES");
		rll.reverseList();
		rll.displayList();
	}
}

class RevListNode{
	private int data;
	private RevListNode next;
	
	public RevListNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public RevListNode getNext(){
		return this.next;
	}
	
	public void setNext(RevListNode next){
		this.next = next;
	}
}
