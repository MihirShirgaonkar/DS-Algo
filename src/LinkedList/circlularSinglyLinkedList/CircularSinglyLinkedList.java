package LinkedList.circlularSinglyLinkedList;

public class CircularSinglyLinkedList {
	
	private Node last;
	int length = 0;
	
	public CircularSinglyLinkedList() {
		this.last = null;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	
	private class Node{
		
		private Node next;
		private int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insertAtStart(int data) {
		Node n = new Node(data);
		
		if(last == null) {
			last = n;
		}else {
			Node temp =last.next;
			n.next =temp;
		}
		last.next = n;
		
		length++;
	}
	
	public void insertAtEnd(int data) {
		Node n = new Node(data);
		
		
		if(isEmpty()) {
			last = n;
		}else {
			Node temp = last.next;
			n.next = temp;
		}
		last.next = n;
		
		last = last.next; 
		length++;
		
	}
	
	public Node deleteFirst() {
		
		if(isEmpty()) {
			return null;
		}
		Node temp = last.next;
		
		last.next = temp.next;
		temp.next =null;
		
		return temp;
	}
	
	public void print() {
		
		if(isEmpty()) {
			System.out.println("null");
			return;
		}
		
		Node curr = last.next; 
		
		
		
		while(curr != last) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);
		
		
	}
	
	
	
	//////
	public void createCircylarSinglyLinkedList() {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
		
	}
	/////

}
