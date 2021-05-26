package Queue.CircularQueueUsingArray;

public class CircularQueueArray {

	
	int arr[];
	int front = -1;
	int rear = -1;
	int size = 0;
	
	public CircularQueueArray(int size) {
		this.arr = new int[size];
		this.size = size;
	}
	
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public void enqueue(int data) {
		
		
		if(isEmpty()) {
			
		front = rear = 0;
		arr[rear] = data;
		return;
		}
		//checks queue is full
		if((rear + 1) % size == front) {
			
			System.out.println("Overflow");
			
		}else {
			// queue is not full
			
			rear = (rear + 1) % size;
			arr[rear] = data;
		}
	}
	
	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("UnderFlow");
			return;
		}
		
		if(front == rear) {
			System.out.println(arr[front]);
			front = rear = -1;
			return;
		}
		System.out.println(arr[front]);
		front = (front + 1) % size;
	}
	
	public void display() {
		
		if(isEmpty()) {
		System.out.println("empty");
		return;
		}
		int i = front;
		
		while( i != rear) {
			System.out.println(arr[i]);
			i = (i + 1) % size;
		}
		System.out.println(arr[rear]);
	}
	
	public void peek() {
		if(isEmpty()) {
			
			System.out.println("empty");
			return;
				
			}
		System.out.println(arr[front]);
	}

}
