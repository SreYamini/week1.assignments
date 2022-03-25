package week1.assignments;

public class Factorial {

	public static void main(String[] args) {
		
			int input;
			int fact=1;
			
			for (input = 10; input > 0; input--) {
				
				fact = fact * input;
			}
		
		System.out.println(fact);

	}

}
