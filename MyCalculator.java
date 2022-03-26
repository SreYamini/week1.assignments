package week1.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int add = cal.add(1, 2, 3);
		int sub = cal.sub(3, 2);
		double mul = cal.mul(3.24d, 5.67d);
		float divide = cal.divide(7.3f, 3.2f);
		
		System.out.println("The addition of numbers"+ add);
		System.out.println("The substraction of numbers"+ sub);
		System.out.println("The multiply of numbers"+ mul);
		System.out.println("The division of numbers"+ divide);

	}

}
