package sumofnaturalnumbers;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of natural numbers for which you want to calculate the sum:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Calling the method to calculate sum : ");

//		System.out.println("The sum of " + num + " natural numbers is : " + calculateSum(num));
		try {
			//System.out.println("The sum of " + num + " natural numbers is : " + calcSumRecursive(num));
			System.out.println("The sum of " + num + " natural numbers is : " + calcSumFormula(num));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Calculate sum using the brute force method
	static int calculateSum(int n) {

		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += i;
		}

		return result;
	}

	// calculate the sum using the recursion method

	static int calcSumRecursive(int n) throws Exception {
		if (n <= 0) {
			System.out.println("The number entered is negative or Zero , Cannot calculate");
			throw new Exception("Number less than zero");
		} else if (n == 1) {
			return 1;
		} else {
			return n + calcSumRecursive(n - 1);
		}
	}
	
	//calculate the sum using the formula
	
	static int calcSumFormula(int n) throws Exception {
		if (n <= 0) {
			System.out.println("The number entered is negative or Zero , Cannot calculate");
			throw new Exception("Number less than zero");
		}  else {
			return (n*(n+1))/2;
		}
	}
}
