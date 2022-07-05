package ch1;

import java.util.Arrays;

public class MinMaxProblem {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;
		int minIdx = 0;
		int maxIdx = 0;
		
		int arr[] = {10,55,23,2,79,101,16,82,30,45};
		
		min = arr[0];
		max = arr[0];
		
		
		for(int i = 0; i<arr.length; i++) {
			if( arr[i]<min ) {
				min = arr[i];
				minIdx = i+1;
			}
			if( arr[i]> max){
				max = arr[i];
				maxIdx = i+1;
			}
				
		
	    }
		System.out.println("ÃÖ´ñ°ª : "+ max +" ÀÎµ¦½º : "+ maxIdx);
		System.out.println("ÃÖ¼Ú°ª : " + min + " ÀÎµ¦½º : "+ minIdx);

  }
}
