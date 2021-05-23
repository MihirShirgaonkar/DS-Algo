package Queue.QueueUsingLinkedList;

public class QueueLinkedList {
	
	Node front ;
	Node rear;
	
	public QueueLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(int data) {
		
		Node n = new Node(data);
		
		if(front == null && rear == null) {
			front = rear = n;
			return;
		}
		
		rear.next = n;
		rear = rear.next;
		
	}
	
	public Node dequeue() {
		
		Node temp = front;
		if(front == null && rear == null) {
			
			return null;
		}
		
		if(front == rear) {
			
			front = rear = null;
			return temp;
		}
		front = front.next;
		return temp;
		
	}
	
	
	public void peek() {
		if(front == null && rear == null) {
			
			System.out.println("null");
			return;
		}
		System.out.println(front.data);
		
		
	}
	
	public void display() {
		Node curr = front;
		
		if(front == null && rear == null) {
			
			System.out.println("null");
			return;
		}
		
		
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data =data;
			this.next =null;
		}
	}

}
