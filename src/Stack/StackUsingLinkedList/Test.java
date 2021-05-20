package Stack.StackUsingLinkedList;

public class Test {

	public static void main(String[] args) {
		
		StackLinkedList n = new StackLinkedList();
		
		n.push(10);
		n.push(11);
		n.push(111);
		n.push(101);

		
//		System.out.println(n.pop());
//		
//		System.out.println(n.length);
//		
//		System.out.println(n.peak());
		
		n.display();
	}

}
