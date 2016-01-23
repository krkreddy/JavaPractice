package linkedlist;

public class SingleLink {
	public static Node first;
	
	public SingleLink(){
		first = new Node();
	}
	
	public void insertNode(int value){
		Node newNode = new Node(value, null);
		newNode.next = first.next;
		first.next = newNode;
	}
	
	public static void main(String args[]){
		SingleLink sll = new SingleLink();
		sll.insertNode(10);
		sll.insertNode(20);
		sll.insertNode(30);
		sll.insertNode(40);
		sll.insertNode(50);
		
		Node track = first.next;
		System.out.println(track.data);
		System.out.println();
		while(track != null){
			System.out.print(track.data+" -> ");
			track = track.next;
		}
		System.out.print("null");
	}
}
