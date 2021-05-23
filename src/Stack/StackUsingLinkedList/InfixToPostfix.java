package Stack.StackUsingLinkedList;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		String equation = "K+L-M*N+(O^P)*W/U/V*T+Q";
		
		System.out.println(getInfixToPostfix(equation));
	}

	public static String getInfixToPostfix(String equ) {
		
		
		String postFix = "";
		
		Stack<Character> operators = new Stack<>();
		
		for(int i = 0;i<equ.length();i++) {
			
			char symbol = equ.charAt(i);
			
			if(Character.isLetter(symbol)){
				postFix = postFix + symbol;
			}else 
				if(symbol == '(') {
				operators.push(symbol);
			}else
				if(symbol == ')') {
					
					while(operators.peek() != '(') {
						postFix = postFix + operators.pop();
					}
					operators.pop();
			}else {
				while(!operators.isEmpty() && !(operators.peek() == '(') &&  prec(symbol) <= prec(operators.peek())) {
					postFix = postFix + operators.pop();
				}
				operators.push(symbol);
			}
			
			
		}
		
		while(!operators.isEmpty()) {
			postFix = postFix + operators.pop();
		}
		
		return  postFix;
	}
	
	
	public static int prec(char symbol) {
		
		if(symbol == '-' || symbol == '+') {
			return 1;
		}
		
		if(symbol == '*' || symbol == '/' || symbol == '%') {
			return 2;
		}
		if(symbol == '^') {
			return 3;
		}
		return 0;
	}

}
