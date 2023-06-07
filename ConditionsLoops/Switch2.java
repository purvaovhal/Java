package ConditionsLoops;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		String abc = ab.nextLine();
		
		switch(abc) {
		case "Jan":
			System.out.println("january");
			break;
		case "Feb":
			System.out.println("February");
			break;
		case "Mar":
			System.out.println("March");
			break;
		case "Apr":
			System.out.println("April");
			break;
		case "May":
			System.out.println("May");
			break;
		case "Jun":
			System.out.println("June");
			break;
		case "Jul":
			System.out.println("July");
			break;
		case "Aug":
			System.out.println("August");
			break;
		case "Sep":
			System.out.println("September");
			break;
		case "Oct":
			System.out.println("Octomber");
			break;
		case "Nov":
			System.out.println("November");
			break;
		case "Dec":
			System.out.println("Dec");
			break;
		default:
			System.out.println("None");
		}
	}

}
