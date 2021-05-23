package Stack.StackUsingLinkedList;

import java.util.Stack;

public class PrefixToInfix {

	public static void main(String[] args) {
		
		
		String equ = "*+ab/ef";
		
		System.out.println(getPrefixToInfix(equ));
	}

	private static String getPrefixToInfix(String equ) {

		Stack<String> stack = new Stack<>();
		

		
		for(int i = equ.length()-1 ; 0<=i ; i--) {
			
			char symbol = equ.charAt(i);
			
			if(symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*' || symbol == '^'){
				String op1 = stack.pop();
				String op2 = stack.pop();
				
				String value = op1 + symbol + op2 ;
				
				stack.push(value);

			}else {
				
				stack.push(String.valueOf(symbol));		
				
				}
			}
		
		
		return stack.pop();
	}

}
