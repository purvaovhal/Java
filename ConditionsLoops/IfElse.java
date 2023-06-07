package ConditionsLoops;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		//int salary = 25000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter salary:");
		
		int salary = input.nextInt();
		
		if(salary > 10000) {
			salary = salary + 2000;
		}
		else if(salary > 20000) {
			salary = salary + 1500;
		}
		else if(salary < 0) {
			System.out.println("Put valid number...");
		}
		else {
			salary += 1000; 
		}
		System.out.println(salary);
	}

}
