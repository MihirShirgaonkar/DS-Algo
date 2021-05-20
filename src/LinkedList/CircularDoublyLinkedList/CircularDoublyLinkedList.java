package LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
	
	Node last;
	int length = 0;
	
	public CircularDoublyLinkedList() {
		this.last = null;
	}
	
	public void addIn(int pos,int data) {
		
		Node curr = last.next;
		while(curr.next != curr) {
			if(curr.data == pos) {
				curr.data = data;
				
				return;
			}
			curr = curr.next;
		}
		
		System.out.println("element not found");
	}
	
public Node deleteAtEnd() {
		
		if(length == 0) {
			return null;
		}
		Node temp = last;
		Node first = temp.next;
		
		last = last.previous;
		last.next = first;
		first.previous = last;
		
		temp.next = null;
		temp.previous = null;
		
		length--;
		return temp;
		
	}
	
	public Node deleteAtStart() {
		
		if(length == 0) {
			return null;
		}
		Node temp = last.next;
		Node nextFirst = temp.next;
		
		last.next = nextFirst;
		nextFirst.previous = last;
		
		temp.next = null;
		temp.previous = null;
		length--;
		return temp;
		
	}
	
	
	public void addAtEnd(int data) {
		Node n = new Node(data);
		
		if(length == 0) {
			last = n;
			n.next = n;
			n.previous = n;
		}else {
			Node first = last.next;
			n.next = first;
			first.previous = n;
			
			last.next = n;
			n.previous = last;
			last = last.next;			
		}
		length++;
	}
	
	public void addAtStart(int data) {
		Node n = new Node(data);
		if(length == 0) {
			last = n;
			n.next = n;
			n.previous = n;
		}else {
			Node first = last.next;
			last.next = n;
			n.previous = last;
			n.next = first;
			first.previous = n;
		}
		length++;
		
	}
	
	public void print() {
		if(length == 0) {
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
	
	public void printReverse() {
		if(length == 0) {
			System.out.println("null");
			return;
		}
		Node curr = last;
		while(curr != last.next) {
			System.out.println(curr.data);
			curr = curr.previous;
		}
		System.out.println(curr.data);
		
	}
	
	
	class Node{
		int data;
		Node next;
		Node previous;
		
		public Node(int data) {
			this.data =data;
		}
	}
}
