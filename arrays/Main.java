package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Arrays:");
	    Scanner ab = new Scanner(System.in);
	    int n = ab.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i = 0;i<arr.length;i++){
	        arr[i] = ab.nextInt();
	    }
	    Arrays.sort(arr);
	    System.out.println("Output: ");
	    for(int i = 0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	    
	    System.out.println("Min: "+arr[0]);
	    System.out.println("Max: "+arr[arr.length-1]);
	    
	}
}
