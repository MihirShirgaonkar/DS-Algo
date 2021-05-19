package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
//	private int length;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
//		this.length = 0;
	}
	
	public boolean isEmpty() {
//		return length == 0;
		return head == null && tail ==null;
	}
	
//	public int length() {
//		return length;
//	}
	
	public void addAtStart(int data) {
		Node n = new Node(data);
		
		if(isEmpty()) {
		tail = n;
		}else {
			head.previous = n;
		}
		n.next = head;
		head = n;
		
	}
	
	public void addAtEnd(int data) {
		Node n = new Node(data);
		
		if(isEmpty()) {
			head = n;
		}else {
			tail.next = n;
			
		}
		n.previous = tail;
		tail = n;
	}
	
	public Node deleteAtStart() {
		if(isEmpty()) {
			return null;
		}else {
			Node temp = head;
			head = head.next;
			head.previous =null;
			temp.next = null;
			return temp;
		}
	}
	
	public Node deleteAtEnd() {
		if(isEmpty()) {
			return null;
		}else {
			Node temp = tail;
			tail = tail.previous;
			tail.next = null;
			temp.previous =null;
			return temp;
		}
	}
	
	public void printReverse() {
		
		if(isEmpty()) {
			System.out.println("null");
			return;
		}
		Node curr = tail;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.previous;
		}
	}
	
	public void print() {
		
		if(isEmpty()) {
			System.out.println("null");
		}
		
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
	}

	private class Node{
		int data;
		Node previous,next;
	
		public Node(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
		}
		
	}	
	
}