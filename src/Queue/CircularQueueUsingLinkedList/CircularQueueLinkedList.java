package Queue.CircularQueueUsingLinkedList;



public class CircularQueueLinkedList {
	
	
	Node front ;
	Node rear;
	
	public CircularQueueLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(int data) {
		Node n= new Node(data);
		
		if(front == null && rear == null) {
			front = rear = n;
			
			rear.next = front;
		}else {
			rear.next = n;
			rear = n;
			rear.next = front;
		}
	}
	
	public Node dequeue() {
		
		if(front == null && rear == null) {
			return null;
		}
		Node temp = front;
		front = front.next;
		rear.next = front;
		
		temp.next = null;
		
		return temp;
	}
	
	public void display() {
		
		if(front == null && rear == null) {
			System.out.println("null");
			return;
		}
		
		Node curr = front;
		while(curr != rear) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void peek() {
		if(front == null && rear == null) {
			System.out.println("null");
			return;
		}
		System.out.println(front.data);
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
