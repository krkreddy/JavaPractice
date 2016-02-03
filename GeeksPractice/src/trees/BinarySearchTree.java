package trees;

public class BinarySearchTree {
	private BinaryTreeNode root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insert(BinaryTreeNode node){
		BinaryTreeNode curr = root;
		BinaryTreeNode parent = null;
		if(root == null){
			root = node;
			return;
		}
		while(curr != null){
			parent = curr;
			if(curr.getData() > node.getData())
				curr = curr.getLeft();
			else
				curr = curr.getRight();
		}
		if(parent.getData() > node.getData())
			parent.setLeft(node);
		else
			parent.setRight(node);
		
		System.out.println(node.getData()+" is inserted after "+parent.getData());	
	}
	
	public int findDepth(int value){
		BinaryTreeNode curr = root;
		int count = 0;
		if(curr == null)
			return -1;
		while(curr != null){
			if(curr.getData() == value)
				return count;
			if(curr.getData() > value)
				curr = curr.getLeft();
			else
				curr = curr.getRight();
			count += 1;
		}
		return -1;
	}
	
	public int findMax(){
		BinaryTreeNode curr = root;
		if(curr == null)
			return -1;
		while(curr.getRight() != null)
			curr = curr.getRight();
		return curr.getData();
	}
	
	public static void main(String[] args){
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(new BinaryTreeNode(5));
		bt.insert(new BinaryTreeNode(7));
		bt.insert(new BinaryTreeNode(3));
		bt.insert(new BinaryTreeNode(4));
		bt.insert(new BinaryTreeNode(6));
		bt.insert(new BinaryTreeNode(8));
		bt.insert(new BinaryTreeNode(2));
		bt.insert(new BinaryTreeNode(9));
		bt.insert(new BinaryTreeNode(1));
		System.out.println("Depth of node 2 is "+bt.findDepth(2));
		System.out.println("Maximum element in the tree is "+bt.findMax());
	}

}

class BinaryTreeNode{
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public BinaryTreeNode getLeft(){
		return this.left;
	}
	
	public BinaryTreeNode getRight(){
		return this.right;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode left){
		this.left = left;
	}
	
	public void setRight(BinaryTreeNode right){
		this.right = right;
	}
}
