package arrays2D;

import java.util.Scanner;

public class SearchElementIndex {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int n = ab.nextInt();
		int m = ab.nextInt();
		System.out.println("Enter the 2Darray:");
		int[][] arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = ab.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				   System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the number");
		int x = ab.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			   if(arr[i][j]==x) {
				   System.out.println("("+i+","+j+")");
			   }
			}
		}

	}

}
