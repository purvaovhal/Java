package functions_methods;

import java.util.Scanner;

public class Fun_Demo {
	public static void main(String[] arg) {
		sum();
		sum();
		
}
  static void sum(){
	  Scanner ab = new Scanner(System.in);
	  System.out.println("Enter first no.:");
	  int a = ab.nextInt();
	  System.out.println("Enter second no.:");
	  int b = ab.nextInt();
	  int sum = a + b ;
	  System.out.println("Sum is:"+sum);
  }
}
