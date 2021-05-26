package Queue.CircularQueueUsingLinkedList;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CircularQueueLinkedList n = new CircularQueueLinkedList();
		
		n.enqueue(1);
		n.enqueue(2);
		n.enqueue(3);
		n.enqueue(4);
		n.enqueue(5);
		
		
		n.dequeue();
		n.dequeue();
		
		System.out.println("----------");
		
		n.enqueue(6);
		n.enqueue(7);
		n.enqueue(8);
		
		n.peek();
		System.out.println("----------");
		n.display();
	}

}
