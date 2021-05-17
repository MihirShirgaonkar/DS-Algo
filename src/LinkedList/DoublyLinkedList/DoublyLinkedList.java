package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int length() {
		return length;
	}
	
	public void print() {
		
		if(head == null && tail == null) {
			System.out.println("null");
		}
		
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
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