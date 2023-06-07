package functions_methods2;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
	    int a = ab.nextInt();
		checkPrime(a);
	}
	static void checkPrime(int n) {
		
		int d = 2;
		while(d < n) {
			if(n % d == 0) {
				System.out.println("Not Prime.");
				return;
			}
			d++;
		}
		System.out.println("Prime.");
	}

}
