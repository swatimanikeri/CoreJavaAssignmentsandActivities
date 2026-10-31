package string_handling;
//literal vs non literal string
public class Test3 {

	public static void main(String[] args) {
		String s1="Testing Strings";
		String s2="Testing Strings";
		String s3=new String(s1);
		String s4="Testing strings";
		System.out.println(s1==s2);//t
		System.out.println(s1==s3);//f
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s3));//t
		System.out.println(s1.equals(s4));//f
		System.out.println(s1.equalsIgnoreCase(s4));//t
		String s5="Testing Strings";
		String s6="Testing Strings";
		
				

	}

}
