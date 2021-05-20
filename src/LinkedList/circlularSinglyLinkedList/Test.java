package LinkedList.circlularSinglyLinkedList;

public class Test {

	public static void main(String[] args) {
	
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		
//		csll.insertAtEnd(1);
//		csll.insertAtEnd(2);
//		csll.insertAtEnd(3);
//		
//		csll.deleteEnd();
		
//		csll.createCircylarSinglyLinkedList();
		
		csll.insertAtEnd(22);
		csll.insertAtEnd(33);
		csll.insertAtEnd(44);
		
		csll.insertAtEnd(22);
		csll.insertAtEnd(33);
		csll.insertAtEnd(44);
		
		csll.insertAtStart(3);
		csll.insertAtStart(2);
		csll.insertAtStart(1);
		
		csll.deleteFirst();
		
		
		csll.print();
		
		
//		System.out.println(csll.length);
		
		

	}

}
