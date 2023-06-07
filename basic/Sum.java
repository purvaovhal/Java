package basic;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.print("Enter two values: ");
		Scanner input = new Scanner(System.in);
	    int num3 = input.nextInt();
	    int num4 = input.nextInt();
		
		int sum = num3 + num4 ;
		System.out.println("Sum is :"+sum);
		
	}

}
