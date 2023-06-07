package ConditionsLoops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
//		for(int num = 0; num <= 10; num+=1) {
//			System.out.println(num);
//		}	
		
		Scanner ab = new Scanner(System.in);
		int num = ab.nextInt();
		for(int a = 0; a <= num; a++) {
			System.out.println(a);
		}
	}

}
