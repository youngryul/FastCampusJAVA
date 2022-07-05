package ch2;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
	
		int arr[] = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int low = 0;
		int high = arr.length -1;
		int mid =0;
		int result = 0;
		
		int target = 83;
		
		while(low <= high) {
			mid = (high + low)/2;
			
			if(arr[mid]== target) {
				result = mid;
				break;
			}
			else if(arr[mid]> target) {
				high = mid -1;
			}
			else
				low = mid + 1;
			
		}
		
		System.out.println(result+1);

	
	}

}
