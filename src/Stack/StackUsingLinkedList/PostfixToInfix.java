package Stack.StackUsingLinkedList;

import java.util.Stack;

public class PostfixToInfix {

	public static void main(String[] args) {
		
		String equ = "KL+MN*-OP^W*U/V/T*+Q+";
		
		System.out.println(getPostfixToInfix(equ));

	}

	private static String getPostfixToInfix(String equ) {
		
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i<equ.length();i++) {
			
			char symbol = equ.charAt(i);
			
			if(symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*' || symbol == '^') {
				
				String op1 = stack.pop();
				String op2 = stack.pop();
				
				String value = op2 + symbol + op1;
				
				stack.push(value);
			}else {
				
				stack.push(String.valueOf(symbol));
			}
		}
		
		return stack.pop();
	}

}
