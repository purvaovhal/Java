package basic;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
	  	System.out.println("Enter temp in C");
		Scanner input = new Scanner(System.in);
		float tempC = input.nextInt();
		float tempF = (tempC * 9/5) + 32;
		System.out.println(tempF);
		
		
//		float tempC = 40;
//		float tempF = (tempC * 9/5) + 32;
//		System.out.println(tempF);

}
}
	