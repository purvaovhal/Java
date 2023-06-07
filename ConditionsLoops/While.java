package ConditionsLoops;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
//		int count = 1;
//		while(count <= 10) {
//			System.out.println(count);
//			count ++;
//		}
		
		Scanner ab = new Scanner(System.in);
		int num = ab.nextInt();
		int a = 0;
		while(a <= num){
			System.out.println(a);
			a+=1;
		}
	}

}
