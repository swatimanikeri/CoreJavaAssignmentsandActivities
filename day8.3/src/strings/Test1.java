package strings;

public class Test1 {

	public static void main(String[] args) {
		String s1="Hello"+"World"; //literal pool -> "Hello" ,  "World",s1->  "HelloWorld"
	       String s2="HelloWorld";//s1,s2 ->SAME literal string
	       System.out.println(s1==s2);//true
	       String s3="Hello".concat("World");//s3 -> non literal "HelloWorld"
	       System.out.println(s2==s3);//f
	       String s4=new String("Testing Strings");//how many string type of objs are created by this statement - 2 
	       String s5="Testing Strings";//s5 -> literal string created in the earlier statement

	}

}
