package Stack.StackUsingLinkedList;

import java.util.Stack;

public class PrefixEvalution {
	

	public static void main(String[] args) {
		
		System.out.println(eveulatePrefix("- + 2 * 3 4 / 16 ^ 2 3"));
	}

	public static double eveulatePrefix(String equ) {
		
		
		Stack<Double> stack = new Stack<>();
		
		for(int i = equ.length()-1 ; 0<=i; i--) {
			
			char symbol = equ.charAt(i);
			
			if(symbol == ' ')continue;
			
			if(symbol == '+' || symbol == '-' ||symbol == '*' || symbol == '/' || symbol =='^') {
				double op1 = stack.pop();
				double op2 = stack.pop();
				
				//a - b
				double value = calculate(op1,op2,symbol);
				
				stack.push(value);
			}else {
				

				StringBuffer temp = new StringBuffer();
				
				
				//when space ' ' comes loops breaks
                while(Character.isDigit(symbol)) {
                	
                    temp.append(symbol);
                    System.out.println(temp+ "------");
                    i--;
                    
                    symbol = equ.charAt(i);
                    
                }
                
                i++;
                //push the number in stack
            
                double num = Double.parseDouble(temp.reverse().toString());
//                System.out.println(num+" push");
                stack.push(num);
				
			}
			
		}
	
		
		return stack.pop();
	}

	
	public static double calculate(double op1 ,double op2, char operation) {
		
		if(operation == '+')return op1 +op2;
		
		if(operation == '-')return op1 - op2;
		
		if(operation == '*')return op1 * op2;
		
		if(operation == '^') return Math.pow(op1, op2);
		
		if(operation == '/') {
			if(op1 == 0) {
				throw new
                UnsupportedOperationException("Cannot divide by zero");
			}
			return op1 / op2;
		}
		
		return 0.0;
	}
}
