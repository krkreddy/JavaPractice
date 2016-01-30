package linkedlist;

public class LinkedList {
	private ListNode headNode;
	
	public LinkedList(){
		headNode =null;
	}
	
	public int listLength(){
		int length = 0;
		ListNode currNode = headNode;
		while(currNode.getNext() != null){
			length++;
			currNode = currNode.getNext();
		}
		return length+1;
	}
	
	public void insertAtBegin(ListNode node){
		node.setNext(headNode);
		headNode = node;
	}
	
	public void insertAtEnd(ListNode node){
		ListNode currNode = headNode;
		if(headNode == null)
			headNode = node;
		else{
			while(currNode.getNext() != null){
				currNode = currNode.getNext();
			}
			currNode.setNext(node);
		}
	}
	
	public void insertAtMiddle(ListNode node, int position){
		ListNode currNode = headNode;
		if(position > listLength())
			position = listLength();
		else if(headNode == null || position <= 0)
			insertAtBegin(node);
		else{
			while(--position > 0){
				System.out.println(currNode.getData());
				currNode = currNode.getNext();
			}
			node.setNext(currNode.getNext());
			currNode.setNext(node);
		}
	}
	
	public void removeAtBegin(){
		ListNode temp = headNode;
		headNode = temp.getNext();
		temp.setNext(null);
	}
	
	public void removeAtEnd(){
		ListNode currNode = headNode;
		ListNode prevNode = null;
		while(currNode.getNext() != null){
			prevNode = currNode;
			currNode = currNode.getNext();
		}
		prevNode.setNext(null);
	}
	
	public void removeInTheMiddle(int position){
		ListNode currNode = headNode;
		ListNode prevNode = null;
		while(--position > 0){
			prevNode = currNode;
			currNode = currNode.getNext();
		}
		prevNode.setNext(currNode.getNext());
	}
	
	public void dispalyList(){
		ListNode currNode = headNode;
		while(currNode.getNext() != null){
			System.out.print(currNode.getData() +" -> ");
			currNode = currNode.getNext();
		}
		System.out.print(currNode.getData()+" -> null");
		System.out.println();
	}
	
	public static void main(String args[]){
		LinkedList llb = new LinkedList();
		System.out.println("INSERT AT THE BEGINNING");
		llb.insertAtBegin(new ListNode(10));
		llb.insertAtBegin(new ListNode(20));
		llb.insertAtBegin(new ListNode(30));
		llb.insertAtBegin(new ListNode(40));
		llb.insertAtBegin(new ListNode(50));
		llb.dispalyList();
		System.out.println("Length of this list is "+llb.listLength());
		System.out.println();
		LinkedList lle = new LinkedList();
		System.out.println("INSERT AT THE END");
		lle.insertAtEnd(new ListNode(10));
		lle.insertAtEnd(new ListNode(20));
		lle.insertAtEnd(new ListNode(30));
		lle.insertAtEnd(new ListNode(40));
		lle.dispalyList();
		System.out.println("Length of this list is "+lle.listLength());
		System.out.println();
		LinkedList llm = new LinkedList();
		System.out.println("INSERT IN THE MIDDLE");
		llm.insertAtBegin(new ListNode(10));
		llm.insertAtBegin(new ListNode(20));
		llm.insertAtBegin(new ListNode(30));
		llm.insertAtBegin(new ListNode(40));
		llm.insertAtBegin(new ListNode(50));
		llm.insertAtMiddle(new ListNode(80),0);
		llm.dispalyList();
		System.out.println("Length of this list is "+llm.listLength());
		System.out.println();
		System.out.println("REMOVE AT THE BEGINNING");
		llb.removeAtBegin();
		llb.dispalyList();
		System.out.println();
		System.out.println("REMOVE AT THE END");
		lle.removeAtEnd();
		lle.dispalyList();
		System.out.println();
		System.out.println("REMOVE IN THE MIDDLE");
		llm.removeInTheMiddle(3);
		llm.dispalyList();
	}
}