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
		last.next =n;
		
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
		length++;
		
	}
	
	public Node deleteEnd() {
		Node temp = last.next;
		if(isEmpty()) {
			return null;
		}else {
			last.next = null;
			last = temp.next;
			temp.next = null; 
			length--;
		}
		return temp;
	}
	
//	public void print() {
//		
//		Node curr = last.next; 
//		while(curr != last) {
//			System.out.println(curr.data);
//			curr = curr.next;
//		}
//		
		
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
