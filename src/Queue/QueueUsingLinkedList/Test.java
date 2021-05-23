package Queue.QueueUsingLinkedList;

public class Test {

	public static void main(String[] args) {
	
		
		QueueLinkedList n = new QueueLinkedList();
		
		n.enqueue(1);
		n.enqueue(2);
		n.enqueue(3);
		n.enqueue(4);
		
		
		System.out.println("Deleted : "+n.dequeue());
		
		n.display();
		
		n.peek();

	}

}
