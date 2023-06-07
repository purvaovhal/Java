package functions_methods2;

import java.util.Scanner;

public class Overloading2 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a = ab.nextInt();
		int b = ab.nextInt();
		float c = ab.nextFloat();
		
		sum(a, b);
		sum(a, b, c);
	}
	
	static void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	static void sum(int a, int b, Float c) {
		float sum =  a + b + c;
		System.out.println(sum);
	}

}
