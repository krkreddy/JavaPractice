package collections;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyStackQueue {

	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		while(!queue.isEmpty()){
			int latest = queue.peek();
			System.out.println(latest);
			queue.remove(latest);
		}
	}
}
