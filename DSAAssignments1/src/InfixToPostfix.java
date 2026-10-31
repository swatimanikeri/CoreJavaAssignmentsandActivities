import java.util.ArrayDeque;
import java.util.Deque;

//SCOPE

public class InfixToPostfix {

	public static void main(String[] args) {
	String str="A*B+C";
    char[] strArr=str.toCharArray();
    int n=strArr.length;
    
    //for final postfix
    StringBuilder postfix=new StringBuilder();
    
    Deque<Character> stack=new ArrayDeque();
    
    for (int i = 0; i <n; i++) {
		char c = strArr[i];
		//letters are appended to the postfix
		if(Character.isLetter(c)) {
			postfix.append(c);
		}

		//if its a symbol or operator
		else {
			//SCO'P'E

		 if(c=='(') {
				stack.push(c);
			}
		 
		 else if(c==')' ) {
				while( !stack.isEmpty() && stack.peek() != '(') {
					//adding oprators to the postfix
					postfix.append(stack.pop());
				}
				//discarding the '('
				if(!stack.isEmpty())
				stack.pop();
			}
		 
			else if ( c!='(' && c!=')') {
				while( !stack.isEmpty()  && getPriority(stack.peek()) >= getPriority(c) ) 
				 {
					postfix.append(stack.pop());
				}
		        stack.push(c);
			}
			
	
		}
		
		
	}
    while (!stack.isEmpty()) {
	    postfix.append(stack.pop());
	}
    
    //display stack elements
 System.out.println(postfix.toString());
	}
	

public static int getPriority(char ch) {
	return switch(ch) {
	case '^' -> 3; 
	case '*','/' ->2;
	case '+','-' -> 1;
	case '(' -> 0;
	default -> throw new IllegalArgumentException("Unexpected value: " + ch); 
	};
}

}

