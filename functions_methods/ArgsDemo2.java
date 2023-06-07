package functions_methods;

import java.util.Scanner;

public class ArgsDemo2 {
	public static void main(String[] args) {
		//String abc = mygreet("Purva");
		//System.out.println(abc);
		
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = ab.next();
		
		String abc = mygreet(name);
		System.out.println(abc);
		
	}
	static String mygreet(String name) {
		String message = "Hello " +name;
		return message;
	}
}
