package Stack.StackUsingLinkedList;

public class StackLinkedList {
	Node top;
	int length = 0;
	
	public StackLinkedList() {
		this.top =null;
	}
	
	public void display() {
		
		if(isEmpty()) {
			return;
		}
		Node curr = top;
		while(curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	
	
	public int peak() {
		
		if(isEmpty()) {
			return (Integer) null;
		}
		return top.data;
	}
	
	
	public Node pop() {
		
		if(isEmpty()) {
			return null;
		}
		Node temp = top;
		top = top.next;
		temp.next =null;
		length--;
		return temp;
	}
	
	public void push(int data) {
		
		Node n = new Node(data);
		
		if(isEmpty()) {
			top = n;
			length++;
			return;
		}
		n.next = top;
		top = n;
		length++;
		
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}

	public class Node{
		int data;
		Node next;
		
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	}
}
