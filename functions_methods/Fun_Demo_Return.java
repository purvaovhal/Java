package functions_methods;

import java.util.Scanner;

public class Fun_Demo_Return {
	public static void main(String[] args) {
		int ans = sum();
		System.out.println("Sum is:"+ans);
	}
   static int sum() {
	   Scanner ab = new Scanner(System.in);
		  System.out.println("Enter first no.:");
		  int a = ab.nextInt();
		  System.out.println("Enter second no.:");
		  int b = ab.nextInt();
		  int sum = a + b ;
		  return sum;
   }
}
