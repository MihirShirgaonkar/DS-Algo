package LinkedList.CircularDoublyLinkedList;

public class Test {

	public static void main(String[] args) {
		

		CircularDoublyLinkedList n = new CircularDoublyLinkedList();
		
		n.addAtStart(12);
		n.addAtStart(22);
		n.addAtStart(33);
		
		n.addAtEnd(88);
		n.addAtEnd(99);
		n.addAtEnd(100);
		
//		n.deleteAtStart();
//		n.deleteAtEnd();
		n.addIn(88, 999);
		n.print();
		
		
//		n.printReverse();
		System.out.println(n.length);
	}

}
