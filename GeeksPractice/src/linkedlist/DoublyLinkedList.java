package linkedlist;

public class DoublyLinkedList {
	private DualNode head;
	private DualNode tail;
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	public void add(DualNode node){
		DualNode curr = head;
		if(curr == null){
			head = node;
			tail = node;
		}
		else{
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
	}
	
	public void display(){
		DualNode hCurr = head;
		DualNode tCurr = tail;
		while(hCurr != null){
			System.out.print(hCurr.getData()+" -> ");
			hCurr = hCurr.getNext();
		}
		System.out.print(" null");
		System.out.println();
		while(tCurr != null){
			System.out.print(tCurr.getData()+" -> ");
			tCurr = tCurr.getPrev();
		}
		System.out.print(" null");
		System.out.println();
			
	}
	
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add(new DualNode(10));
		dll.add(new DualNode(20));
		dll.add(new DualNode(30));
		dll.add(new DualNode(40));
		dll.add(new DualNode(50));
		dll.display();
	}

}

class DualNode{
	private int data;
	private DualNode prev;
	private DualNode next;
	
	public DualNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public DualNode getPrev(){
		return this.prev;
	}
	
	public DualNode getNext(){
		return this.next;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setPrev(DualNode prev){
		this.prev = prev;
	}
	
	public void setNext(DualNode next){
		this.next = next;
	}
}