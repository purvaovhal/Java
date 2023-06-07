package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPassingInFunctions {
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();

		int[] num = new int[n];

		for(int i = 0;i<num.length;i++)
		{
			num[i] = ab.nextInt();
		}
		
		System.out.println(Arrays.toString(num));
		
		change(num);
		
		System.out.println(Arrays.toString(num));
	}
	static int[] change(int[] arr) {
	    
         Scanner ab = new Scanner(System.in);
		 int c = ab.nextInt();
		 int d = ab.nextInt();

		arr[c]= d;
		return arr;
	}
}
