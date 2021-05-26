package Queue.QueueUsingStack;

import Stack.StackUsingArray.StackArray;

public class QueueUsingStack {

	StackArray s1;
	StackArray s2;
	int size = 0;
	int top1 = -1;
	int top2 = -1;
	int count = 0;
	
	public QueueUsingStack(int size) {
		this.s1 = new StackArray(size);
		this.s2 = new StackArray(size);
		this.size = size;
	}
	
	public void enqueue(int x) {
		push1(x);
		count++;
	}

	private void push1(int x) {
		
		if(top1 == size -1) {
			System.out.println("Overflow");
		}else {
			top1++;
			s1.push(x);
			
		}
	}
	
	public void dequeue() {
		
		if(top1 ==-1 && top2 == -1) {
			System.out.println("Underflow");
		}else {
			
			for(int i = 0; i < count; i++) {
				push2(pop1());
			}
			int result = s2.pop();
			count--;
			for(int i = 0; i < count ; i++) {
				push1(pop2());
			}
			
			
		}
	}

	private void push2(int pop2) {
		if(top2 == size -1) {
			System.out.println("Overflow");
		}else {
			top2++;
			s2.push(pop2);
			
		}
		
	}

	private int pop1() {
		top1--;
		return s1.pop();
	}
	private int pop2() {
		top2--;
		return s2.pop();
	}
	
	public void display() {
		
		if(top1 == -1) {
			System.out.println("EmptyQueue");
		return;
		}
		
		s1.display();
	}
	
	
}
