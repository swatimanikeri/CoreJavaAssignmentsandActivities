package strings;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String[] names= {"Kiran","Anish","Amitee","Meera","Mihir","Sameer","Shubham","Meera"};
		System.out.println(Arrays.toString(names));//un sorted
	//	System.out.println(names[3].compareTo(names[7]));// 0
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));//sorted as per String's compareTo
		
		String s1="    Testing Strings here     ";
		String s2=s1.trim();
		System.out.println("s1-"+s1);//with leading  & trailing spaces
		System.out.println("s2="+s2);//removed spaces
		String s3="      ";
		System.out.println(s3.isBlank());//t
		System.out.println(s3.isEmpty());//f
		String s4="one,two,three,four,five";
		String[] tokens=s4.split(",");
		System.out.println("Splitted tokens "+Arrays.toString(tokens));
		//join char seq using delimiter
		String joinedString=String.join(":", "one","two","three");
		System.out.println(joinedString);

	}

}
