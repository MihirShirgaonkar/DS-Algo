package Queue.QueueUsingArray;

public class QueueArray {
	
	
	int arr[];
	int front = -1;
	int rear = -1;
	int size = 0;
	
	public QueueArray(int size) {
		arr = new int[size];
		this.size = size;
	}
	
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public void enqueue(int data) {
		
		
		if(size-1 == rear) {
			System.out.println("Overflow");
			return;
		}
		
		if(isEmpty()) {
			
			front++;
			
		}
		rear++;
		arr[rear] = data;
	}
	
	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("UnderFlow");
			return;
		}
		
		if(front == size-1) {
			
			System.out.println("UnderFlow");
			return;
		}
		arr[front] = 0;
		front++;
	}
	
	public void print() {
		
		if(isEmpty()) {
			
		System.out.println("empty");
		return;
			
		}
		
		for(int i =front;i<=rear;i++) {
			
			System.out.println(arr[i]);
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			
			System.out.println("empty");
			return;
				
			}
		System.out.println(arr[front]);
	}

}
