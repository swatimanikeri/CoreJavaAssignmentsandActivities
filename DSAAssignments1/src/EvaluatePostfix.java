//import java.util.ArrayDeque;
//import java.util.Deque;
//
//public class EvaluatePostfix {
//
//	public static void main(String[] args) {
//		String str="3*5+2";
//		
//	    char[] strArr=str.toCharArray();
//	    int n=strArr.length;
//	    
//	    //for final postfix
//	    StringBuilder postfix=new StringBuilder();
//	    
//	    Deque<Character> stack=new ArrayDeque();
//	    
//	    for (int i = 0; i < n; i++) {
//			char c = strArr[i];
//			
//			//check if the char is a digit then add to stack
//			if(Character.isDigit(c)) {
//				stack.push(c);
//			}
//			//if its an opeartor then we have to evaluate the exp.
//			else {
//				char operator=c;
////				int operand1=Integer.parseInt(stack.pop());  
//				Character operand1=stack.peek(); 
//				Character operand2=stack.peek(); 
//			}
//			
//		}
//	}
//
//}

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluatePostfix {

	public static void main(String[] args) {
//		String str = "3*5+2";
		String str = "532*-";
		System.out.println("Result: " + evaluateInfix(str));
	}

	public static int evaluateInfix(String expression) {
		char[] tokens = expression.toCharArray();

		// Stack for numbers (Values)
		Deque<Integer> values = new ArrayDeque<>();

		// Stack for Operators
		Deque<Character> ops = new ArrayDeque<>();

		for (int i = 0; i < tokens.length; i++) {
			char c = tokens[i];

			// 1. If it's a NUMBER, push it to the values stack
			if (Character.isDigit(c)) {
				values.push(c - '0'); // Converts char '3' to int 3
			} 
			// 2. If it's an operator SYMBOL
			else if (c == '+' || c == '-' || c == '*' || c == '/') {
				// While the top of 'ops' has same or higher precedence, apply it
				
				while (!ops.isEmpty() && hasPrecedence(c, ops.peek())) {
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				}
				// Push the current operator to the stack
				ops.push(c);
			}
		}

		// 3. Entire expression has been parsed, apply remaining operators
		while (!ops.isEmpty()) {
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		}

		// The top of the values stack contains the final result
		return values.pop();
	}

	// Returns true if 'op2' has higher or same precedence than 'op1'
	public static boolean hasPrecedence(char op1, char op2) {
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
			return false;
		}
		return true;
	}

	// Applies an operator to two operands
	public static int applyOp(char op, int b, int a) { // Note: 'a' is popped second, so it's the first operand
		switch (op) {
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': 
				if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
				return a / b;
		}
		return 0;
	}
}

