package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		System.out.println("Arrays:");
	    Scanner ab = new Scanner(System.in);
	    int n = ab.nextInt();
	    String[] arr = new String[n];
	    
	    for(int i = 0;i<n;i++){
	        arr[i] = ab.next();
	    }
	    System.out.print("Output: ");
	    for(int i = 0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	    
	    System.out.println(Arrays.toString(arr));
	    
	}
}
