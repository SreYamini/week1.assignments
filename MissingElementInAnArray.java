package week1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

				int[] arr = {1,2,3,5,6,7,8};
				
				Arrays.sort(arr);
				
				for (int i = arr[0]; i < arr.length; i++) {
					
					if(i!=arr[i-1]) {
						
						System.out.println(i);
						
						break;
					}
					
				}

	}

}
