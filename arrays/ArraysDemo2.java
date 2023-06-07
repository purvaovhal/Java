package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter:");
		
		int n = ab.nextInt();
		
		int[] arr = new int[n];
		// take input from user
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = ab.nextInt();
		}
		//print array using for loop
		for(int i = 0 ; i<arr.length ;i++) {
		    System.out.println(arr[i]);
		}
		
		//print array using for each loop
		for(int i: arr) {  // for every element in the array, print the element.
			System.out.println(i); //here i represents element of the array
		}
		
		//print array using Arrays class
		System.out.print(Arrays.toString(arr));
		
		// Array of non primitive type
		
		// String[] str = new String[3];
		
		// for(int i = 0;i<str.length;i++) {
		// 	str[i] = ab.next();
		// }
		// System.out.println(Arrays.toString(str));
		
		// //str[1] = "ABC";
           
		// System.out.println(Arrays.toString(str));
		
		// for (String aa : str) {
		// 	System.out.println(aa);
		// }

	}

}
