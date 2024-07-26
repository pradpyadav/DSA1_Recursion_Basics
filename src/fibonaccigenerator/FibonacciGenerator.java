package fibonaccigenerator;

import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Nth Fibonacci Generator Program:");
		System.out.println("Enter the number to find the fibonacci value of it");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		try {
			System.out.println("The : " + num + "th term in the fibonacci series is : " + generateNthFibonacci(num));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static int generateNthFibonacci(int n) throws Exception {
		if (n < 0) {
			throw new Exception("Not a valid number");

		} else if (n == 0 || n == 1) {
			return 1;
		} else {
			return generateNthFibonacci(n - 1) + generateNthFibonacci(n - 2);
		}
	}

}
