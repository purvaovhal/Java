package functions_methods;

import java.util.Scanner;

public class PrintFactorial {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		printfact(n);
	}
	static void printfact(int n) {
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
		int factorial = 1;
		for(int i = n; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;
	}

}
