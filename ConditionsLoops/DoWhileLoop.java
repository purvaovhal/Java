package ConditionsLoops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
//		int a = 0;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<=10);
//	}

	Scanner ab = new Scanner(System.in);
	int a = ab.nextInt();
	int num = 0;
	do {
		System.out.println(num);
		num+=1;
	}while(num<=a);
	
}
	
}
