package Day07;

public class CheckPalindromUsingRecursion {

	public static void main(String[] args) {
		String str="abyura";
		int n=str.length()-1;
		System.out.println(checkIfPalindrom(str,0));

	}

	private static boolean checkIfPalindrom(String str,int start) {
//		
//		int start=0;
		int n=str.length();
	if(start>str.length()/2) return true;	
	if(str.charAt(start)!=str.charAt(n-start-1))
		return false; //breaks the overall execution
	return checkIfPalindrom( str, start+1);
		
	}
	

}
