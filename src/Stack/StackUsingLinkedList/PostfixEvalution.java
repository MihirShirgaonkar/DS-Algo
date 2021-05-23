package Stack.StackUsingLinkedList;

import java.util.Stack;

public class PostfixEvalution {

	
public static void main(String[] args) {
		
		System.out.println(eveulatePostfix("2 3 1 * + 9 -"));
	}

public static double eveulatePostfix(String equ) {
	
	
	Stack<Double> stack =new Stack<>();
	
	for(int i = 0; i< equ.length(); i++) {
		
		char symbol = equ.charAt(i);
		
		if(symbol == ' ')continue;
		
		if(symbol == '+' || symbol == '-' || symbol == '^' || symbol == '*' || symbol == '/') {
			
			double op1 = stack.pop();
			double op2 = stack.pop();
			
			//b - a
			double value = calculate(op2,op1,symbol);
			
			stack.push(value);
		}else {
			
			StringBuffer sb = new StringBuffer();
			
			while(Character.isDigit(symbol)) {
				sb.append(symbol);
				i++;
				symbol = equ.charAt(i);
			}
			i--;
			double num = Double.parseDouble(sb.reverse().toString());
			stack.push(num);
		}
	}
	
	
	
	return stack.pop();
}

public static double calculate(double a , double b, char op) {
	
	if(op == '+')return a + b;
	
	if(op == '-')return a - b;
	
	if(op == '*')return a * b;
	
	if(op == '^') return Math.pow(a, b);
	
	if(op == '/') {
		if(a == 0) {
			throw new
            UnsupportedOperationException("Cannot divide by zero");
		}
		return a / b;
	}
	
	return 0.0;
}


}
