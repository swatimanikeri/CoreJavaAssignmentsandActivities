package string_handling;
//testing == vs equals
public class Test2 {

	public static void main(String[] args) {
		String s1=new String("Testing Strings");
		String s2=new String("Testing Strings");
		String s3=s1;
		String s4=new String("Testing strings");
		System.out.println(s1==s2);//f
		System.out.println(s1==s3);//t
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s3));//t
		System.out.println(s1.equals(s4));//f
		System.out.println(s1.equalsIgnoreCase(s4));//t

	}

}
