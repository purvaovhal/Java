package ConditionsLoops;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
         Scanner ab = new Scanner(System.in);
			int n = ab.nextInt();
			for(int i = 1;i<=10;i++) {
				System.out.println(n+" x "+i+" = "+n*i);
			}

	}
}

