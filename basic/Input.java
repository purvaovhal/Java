package basic;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
	System.out.println("Enter some input");
	Scanner input = new Scanner(System.in);
	int rollNo = input.nextInt();
	System.out.println("Your rollno is "+rollNo);
}
}
