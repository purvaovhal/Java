package functions_methods;

import java.util.Scanner;

public class SwapDemo {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first no.:");
		  int x = ab.nextInt();
		  System.out.println("Enter second no.:");
		  int y = ab.nextInt();
		  System.out.println("1. Swap\n2. Sum");
		  int key = ab.nextInt();
		  if(key==1) {
		swap(x, y );
		return;
		  }

		  if(key==2) {
//		swap(412, 236);
		sum(x, y);
		  }
	}
	static void swap(int a , int b ) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+" " +b);
	}
	
	static void sum(int a , int b) {
		int sum = a + b;
		System.out.println(sum);
	}
}
