package Stack.StackUsingArray;

public class StackArray {
	
	
	int size ;
	int top = -1;
	int arr[] ;
	
	public StackArray(int size) {
		this.arr = new int[size];
		this.size = size;
	}
	
	public boolean isEmpty() {
		return top ==0;
	}
	
	public int length() {
		return top+1;
	}
	
	public void push(int data) {
		
		if(top == size - 1) {
		 System.out.println("StackSizeExcceded");
		}else {
		top++;
		arr[top] = data;
		
		}
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("EmptyStack");
			return 0;
		}else {
			int temp = arr[top];
			arr[top] = 0;
			top--;
			return temp;
		}	
	}
	
	public int preak() {
		
		if(top == -1) {
			System.out.println("EmptyStack");
			return 0;
		}
		return arr[top];
	}
	
	public void display() {
		
		if(top == -1) {
			System.out.println("EmptyStack");
			return;
		}
		for(int i = 0;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
