package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};

		Arrays.sort(data);
		
		int arrlen = data.length;
		
		System.out.println(data[arrlen-2]);
	}

}
