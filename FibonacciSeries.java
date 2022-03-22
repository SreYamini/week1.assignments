package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

			int range = 8;
			int firstNum = 0;
			int secNum = 1;
			int sum;
			
			System.out.println(firstNum);
			

			for (int i = 1; i <= range; i++) {
				
				sum = firstNum + secNum;
				
				firstNum = secNum;
				
				secNum = sum;
				
				System.out.println(sum);
				
			}
			
			
				// Print first number
				
				// Iterate from 1 to the range
				
				// add first and second number assign to sum

				// Assign second number to the first number

				// Assign sum to the second number
				
				// print sum

	}

}
