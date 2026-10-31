package Day07;

public class ReverseString {

	public static void main(String[] args) {
		String str="swati";
		int n=str.length()-1;
	
    char [] arr=str.toCharArray();
		char ans[]=reverseString(arr,0);
		for(char ch:ans) {
			System.out.print(ch);
		}
	
		

	}

	private static char[] reverseString(char[] arr,int start) {
	
////		
////		int start=0;
//		int n=str.length();
//	if(start>str.length()/2) return true;	
//	if(str.charAt(start)!=str.charAt(n-start-1))
//		return false; //breaks the overall execution
//	return checkIfPalindrom( str, start+1);
//		
		int n=arr.length;
		if(start>arr.length/2) return arr;
		swap(arr,start);
		return reverseString(arr,start+1);

		}
	
	
	public static void swap(char arr[],int start) {
	char temp=arr[arr.length-start-1];
		arr[arr.length-start-1]=arr[start];
		arr[start]=temp;
	}
}
