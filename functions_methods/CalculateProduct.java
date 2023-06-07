package functions_methods;

import java.util.Scanner;

public class CalculateProduct {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		
		//int x = ab.nextInt();
		//int y = ab.nextInt();
		
		//product(ab.nextInt(), ab.nextInt())     [<--> (x, y)]
		
		System.out.println(product(ab.nextInt(), ab.nextInt()));
	}
	static int product(int a, int b) {
		//System.out.println(a*b);
		return a*b;
	}
}
