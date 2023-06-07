package ConditionsLoops;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] arg) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		
		while(count<=n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
			System.out.println(b);
		}
		//System.out.println(b); <--only for nth number.
	}

}
