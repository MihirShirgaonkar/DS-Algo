package Stack.StackUsingLinkedList;

import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		
		String equation = "K+L-M*N+(O^P)*W/U/V*T+Q";
		
		System.out.println(getInfixToPrefix(equation));
	}

	private static String getInfixToPrefix(String equ) {
		
		String prefix = "";
		
		Stack<Character> operators = new Stack<>();
		
		for(int i = equ.length()-1 ; 0<=i ; i-- ) {
			
			char symbol = equ.charAt(i);
			
			if(Character.isLetter(symbol)) {
				
				prefix = symbol + prefix;
				
			}else if(symbol == ')') {
				
				operators.push(symbol);
				
			}else if(symbol == '(') {
				
				while(operators.peek() != ')') {
					
					prefix = operators.pop() + prefix;
				}
				operators.pop();
			}else {
				while(!operators.isEmpty() && !(operators.peek() == ')') && prec(symbol) < prec(operators.peek()) ) {
					prefix = operators.pop() + prefix;
				}
				operators.push(symbol);
			}
			
		}
		
		while(!operators.isEmpty()) {
			prefix = operators.pop() + prefix;
		}
		
		return prefix;
	}
	
	public static int prec(char x) {
		
		
		if(x == '+' || x == '-') {
			return 1;
		}else
		
		if(x == '*' || x == '/' || x == '%') {
			return 2;
		}else
		
		if(x == '^') {
			return 3;
		}
		return 0;
		
	}

}
