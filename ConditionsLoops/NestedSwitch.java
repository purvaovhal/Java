package ConditionsLoops;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
	int empID = ab.nextInt();
	String department = ab.next();
	
	switch(empID) {
	case 1:
		System.out.println("ABC XYZ");
		break;
	case 2:
		System.out.println("DEF PQR");
		break;
	case 3:
		System.out.println("Emp Number 3");
		switch (department) {	
		case "IT":
			System.out.println("IT Department");
		    break;
		case "Management":
			System.out.println("Management Department");
		    break;
		    default:
		    	System.out.println("No Department entered");
		}
		break;
		default:
		System.out.println("Enter correct EmpID");
	}
	}
}
