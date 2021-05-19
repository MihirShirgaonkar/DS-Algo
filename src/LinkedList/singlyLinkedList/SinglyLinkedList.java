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
	
	public int size() {
		int size = 0;
		
		if(head == null) {
			return size;
		}
		
		if(head.next == null) {
			return size+1;
		}
		
		
		Node curr = head;
		while(curr.next != null) {
			size++;
			curr = curr.next; 
		}
		return size+1;
	}
	
	public void reverseList() {
		
		Node curr = head;
		Node next = null;
		Node prev = null;
		while(curr != null) {
			
			next = curr.next;
			curr.next =prev;
			prev = curr;
			curr = next;
		}
		head = prev;
				
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
	
	
	//////////////Floyd's Cycle Algorithm/////////////////
	
	public boolean isLoopPresent() {

		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	
	public Node getLoopStartNode() {
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				getStartNode(slowPtr);
			}
		}
		return null;
	}
	
	private Node getStartNode(Node slowPtr) {
		Node curr = head;
		while(curr != null && slowPtr != null) {
			curr = curr.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr ==curr) {
				return slowPtr;
			}
		}
		return null;
	}
	
	public void removeLoop() {
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				privateLoopRemover(slowPtr);
			}
		}
	}
	
	public void privateLoopRemover(Node slowPtr) {
		Node curr = head;
		while(curr.next != slowPtr.next) {
			curr = curr.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	
	
	/////////////////////////////////////////////////////
	
}

	class Node{
		
	int data;

	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}