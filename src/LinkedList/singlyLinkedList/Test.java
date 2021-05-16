package LinkedList.singlyLinkedList;

public class Test {

	public static void main(String[] args) {

		
		SinglyLinkedList ll = new SinglyLinkedList();
//		
		ll.addNodeToEnd(1);
		ll.addNodeToEnd(2);
//		ll.addNodeToStart(45);
		ll.addNodeToEnd(3);
		ll.addNodeToEnd(4);
//		
//		ll.addNodeAfter(2, 33);
//		ll.addNodeAfter(123, 45);
//		
		ll.deleteAfter(2);
		
		ll.print();
//		System.out.println(i);
	}

}
