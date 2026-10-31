package strings;

import java.util.Date;

/*
 * Testing StringBuilder | StringBuffer
 */

public class Test3 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello Builder");
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println(sb1);
		StringBuilder sb2=sb1.append(true).append(123.45).append(5678)
		.append(new Date());
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);//t
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb2.insert(0, new char[] {'a','b','c'});
		System.out.println(sb1);
		sb1.replace(0, sb1.length(), "NEW CONTENTS");
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println(sb1);
		sb1.trimToSize();
		System.out.println(sb1.length()+" "+sb1.capacity());
		StringBuilder sb3=new StringBuilder("Hello");
		StringBuilder sb4=new StringBuilder("Hello");
		System.out.println(sb3==sb4);//f
		System.out.println(sb3.equals(sb4));//f
		
	}

}
