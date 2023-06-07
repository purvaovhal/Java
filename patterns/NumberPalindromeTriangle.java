package patterns;

import java.util.Scanner;

public class NumberPalindromeTriangle {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		for(int i=1;i<=n;i++)
		{ 
		    //Spaces
		    for(int s=1;s<=n-i;s++){
		        System.out.print("  ");
		    }
		    
		    //first half
		    for(int j=i;j>=1;j--){
		        System.out.print(j+" ");
		    }
		    
		    //second half
		    for(int k=2;k<=i;k++){
		        System.out.print(k+" ");
		    }
		    System.out.println();
	    }
}

}
