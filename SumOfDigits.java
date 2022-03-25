package week1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
				int input =123;
				
				int sum = 0;
				int remainder;
				
				while (input>0) {
					
					remainder = input%10;
					
					//System.out.println("The remainder is"+ remainder);
					
					sum = sum + remainder;
					
					//System.out.println("The sum is"+ sum);
					
					input= input/10;
			
				}
				
				System.out.println("The final sum is"+ sum);
				

	}

}
