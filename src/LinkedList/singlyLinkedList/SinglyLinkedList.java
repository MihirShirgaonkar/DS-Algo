package LinkedList.singlyLinkedList;

public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList() {
	}
	
	public void addNodeToEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	public void addNodeToStart(int data) {
		Node n = new Node(data);
		
		n.next = head;
		head = n;
		
	}
	
	public void addNodeAfter(int pData , int data) {
		
		Node n = new Node(data);
		
		Node curr = head;
		while(curr.next !=  null) {
			if(curr.data == pData) {
				
				
				Node temp = curr.next;
				curr.next = n;
				n.next = temp;
//				or
//				n.next = curr.next;
//				n = curr.next
				
				return;
			}
			curr = curr.next;
		}
		curr.next = n;
	}
	
	public void deleteAtEnd() {
		
		if(head == null ) {
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node curr = head;
		while(curr.next.next != null) {
			
			curr = curr.next;
		}
		curr.next = null;
		
	}
	
	public int deleteAtStart() {
		if(head != null) {
			Node toDelete = head;
			head = head.next;
			return toDelete.data;
		}
		return (Integer) null;
		
	}
	
	public void deleteAfter(int pData) {
		
		Node curr = head;
		while(curr != null) {
			if(curr.data == pData) {
				if(curr.next == null) {
					System.out.println("Data not found");
					return;
				}else {
				curr.next = curr.next.next;
				return;
				}
			}
			
			
			curr = curr.next;
		}
		System.out.println("Data not found");
		
	}


	public void print() {
		
		if(head == null) {
			System.out.println("null");
			return;
		}
		
		Node curr = head;
		while(curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);
			
	}
	
	
	
	
}

	class Node{
		
	int data;

	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}