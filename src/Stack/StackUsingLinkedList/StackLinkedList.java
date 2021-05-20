package Stack.StackUsingLinkedList;

public class StackLinkedList {
	Node top;
	int length = 0;
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}

	private class Node{
		int data;
		Node next;
		
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	}
}
