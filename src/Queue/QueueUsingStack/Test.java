package Queue.QueueUsingStack;

public class Test {

	public static void main(String[] args) {
		
		QueueUsingStack n = new QueueUsingStack(5);
		
		n.enqueue(1);
		n.enqueue(2);
		n.enqueue(3);
		n.enqueue(4);
		n.enqueue(5);
		
		n.dequeue();
		n.dequeue();
		
		
		n.display();
	}

}
