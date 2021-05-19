package LinkedList.DoublyLinkedList;

public class Test {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
//		
		dll.addAtEnd(1);
		dll.addAtEnd(2);
		dll.addAtEnd(3);
		dll.addAtStart(44);
		
		dll.deleteAtEnd();
		
//		dll.printReverse();
		dll.print();

	}

}
