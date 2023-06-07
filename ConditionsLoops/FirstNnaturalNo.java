package ConditionsLoops;

import java.util.Scanner;

public class FirstNnaturalNo {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			 sum = sum + i;		
		}
		System.out.println(sum);		
	}

}
