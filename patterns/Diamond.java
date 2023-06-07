package patterns;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		for(int i=1;i<=n;i++)
		{
		    //Spaces
		    for(int s=1;s<=n-i;s++){
		        System.out.print(" ");
		    }
		    
		    for(int j=1;j<=2*i-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
	   }
	
	for(int i=n;i>=1;i--){
		    //Spaces
		    for(int s=1;s<=n-i;s++){
		        System.out.print(" ");
		    }
		    
		    for(int j=1;j<=2*i-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
	}
}

}
