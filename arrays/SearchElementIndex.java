package arrays;

import java.util.Scanner;

public class SearchElementIndex {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = ab.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++) {
			arr[i]=ab.nextInt();
		}
		System.out.print("Enter the number that you want to search:");
		int x = ab.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println(x+" found at index "+i);
				return;
			}
		}

}
}
