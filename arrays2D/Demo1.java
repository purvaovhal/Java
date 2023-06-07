package arrays2D;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 1 2 3
		 4 5 6
		 7 8 9 
		 */
		
		//int[][] arr1 = new int[3][];
		
		int[][] arr = {
				{1, 2, 3},  //0th index
				{4, 5, 6},  //1st index
				{7, 8, 9}   //2nd index arr[2]-->{7, 8, 9}
		};
	//	System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr[1])); //[4, 5, 6]
		System.out.println(arr[1][2]);   // 6
	
	}

}
