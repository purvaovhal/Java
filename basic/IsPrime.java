package basic;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		int d = 2;
		while(d < n) {
			if(n % d == 0) {
				System.out.println("Not Prime..");
				return;
			}
			d++;
		}
		System.out.println("Prime..");
	}

}
