package LinkedList.circlularSinglyLinkedList;

public class Test {

	public static void main(String[] args) {
	
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		
		csll.insertAtEnd(1);
		csll.insertAtEnd(2);
		csll.insertAtEnd(3);
		
		csll.deleteEnd();
		
//		csll.print();
		System.out.println(csll.length);
		
		

	}

}
