package Day07;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] arr= {10,11,12,34,56,78,90};
		int start=0;
		int end=arr.length-1;
		System.out.println(binarySearch(arr,start,end,78));
	}

	private static int binarySearch(int[] arr, int start, int end,int target) {
		int mid=(start+end)/2;
		if(start>end) return -1;
		// we have to maintain the edge case ,so 
		 if(arr[mid]==target) return mid;
		
	if(arr[mid]>target) {
		return binarySearch( arr,  start,  mid,target);
	}
	else {
		return binarySearch( arr,  mid+1,  end,target);
	}
//		return mid;
		
	}

}
