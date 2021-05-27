package BinaryTree.Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	Node root;
	
	
	public void create() {
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
		Node a6 = new Node(6);
		Node a7 = new Node(7);
		Node a8 = new Node(8);
		
		root = a1;
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a4.left = a6;
		a3.left = a7;
		a3.right =a8;
		
	}
	
	class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data =data;
		}
	}
	
	public void recursivePreOrder(Node r) {
		if(r == null) {
			return;
		}
		System.out.print(r.data + " ");
		recursivePreOrder(r.left);
		recursivePreOrder(r.right);
	}
	
	public void iterativePreOrder() {
		if(root==null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			Node temp = stack.pop();
			System.out.print(temp.data +" ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
		 
	}
	
	public void recursiveInOrder(Node r) {
		if(r == null) {
			return;
		}
		recursiveInOrder(r.left);
		System.out.print(r.data + " ");
		recursiveInOrder(r.right);
		
		
	}


	public void iterativeInOrder() {
		if(root==null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}else {
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
	}
	
	public void recursivePostOrder(Node r) {
		if(r == null) {
			return;
		}
		recursivePostOrder(r.left);
		recursivePostOrder(r.right);
		System.out.print(r.data +" ");
	}
	
	
	public void iterativePostOrder() {
		Node curr = root;
		Stack<Node> stack = new Stack<>();
		while(!stack.isEmpty() || curr != null) {
			if(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}else {
				Node temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data +" ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data +" ");
					}
				}else {
					curr = temp;
				}
			}
		}
		
	}
	
	public void levalOrderTraversal() {
		if(root == null) {
			return;
		}
		Node temp =root;
		Queue<Node> queue =new LinkedList<>();
		queue.add(temp);
		while(!queue.isEmpty()) {
			temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
