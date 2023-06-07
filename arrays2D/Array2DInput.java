package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DInput {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter 2D array:");
		int[][] arr = new int[3][3];
		System.out.println(arr.length); // will give number of rows of the array
		
		for(int row = 0; row<arr.length; row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col] = ab.nextInt();
			}
		}
		
		// Output
		for(int row = 0; row<arr.length; row++) {
			for(int  col =0;col<arr[row].length;col++) {
			   System.out.print(arr[row][col]+" ");
			}
			System.out.println(); // After every row, print new line
		}
		System.out.println();
		
		// Output with toString method
		for(int i = 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		
		// Output with enhance for loop 
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	
	
	
	}

}
