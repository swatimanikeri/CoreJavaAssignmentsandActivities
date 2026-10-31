package string_handling;
// to test immutability of strings
public class Test1 {

	public static void main(String[] args) {
		 String s1=new String("Hello");
		s1.concat("hi");
		System.out.println(s1);//hello
		s1 += "12345";//s1 = s1 + "12345"
		System.out.println(s1);//Hello12345
		String s2=s1.toUpperCase();
		System.out.println(s1);//original
		System.out.println(s2);//upper cased
		System.out.println(s1.replaceAll("l", "t"));//replaced
		

	}

}
