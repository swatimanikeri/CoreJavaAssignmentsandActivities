import java.util.ArrayDeque;
import java.util.Deque;

public class ValidStringOfBrackets {
	public static void main(String[] args)  {
	String str1="{[()]}";
	String str2="[(])";
	String str3="((()";
	String str4="())";
    
  if( checkIfValid( str3))
  System.out.println("The string is valid");
  else
	  System.out.println("The string is invalid");
}

	private static boolean checkIfValid(String str1) {
		
		char[] strArr1=str1.toCharArray();
		 Deque<Character> stack=new ArrayDeque();
		 
	    for (int i = 0; i < strArr1.length; i++) {
	    	
			char c = strArr1[i];
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else if(c==')' ) {
				if(stack.peek() == '(')
				stack.pop();
				else return false;
			}
			else if(c=='}' ) {
				if(stack.peek() == '{')
				stack.pop();
				else return false;
			}
			else if(c==']' ) {
				if(stack.peek() == '[')
				stack.pop();
				else return false;
			}
		}
		return true;
		
	}
}
