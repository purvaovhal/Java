package patterns;

import java.util.Scanner;

public class Patterns2 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		pattern1(n);
		System.out.println();
		pattern2(n); 
		System.out.println();
		pattern3(n);
		System.out.println();
		pattern4(n);
		System.out.println();
		pattern5(n);
		System.out.println();
		pattern6(n);
	}
	static void pattern1(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
			for (int i=n;i>=1;i--) {         
				for(int j=1 ;j<=i;j++) {  
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	
	static void pattern3(int n) {
		   for(int i=1;i<=n;i++){
		       for(int s=1;s<=n-i;s++){
		           System.out.print("  ");
		       }
		       for(int j=1;j<=i;j++){
		               System.out.print("* ");
		           }
		       System.out.println();
		   }
		}
	
	static void pattern4(int n) {
		   for(int i=n;i>=1;i--){
		       for(int j=1;j<=i;j++){
		           System.out.print(j+" ");
		       }
		       System.out.println();
		   }
		}
	// Floyd's triangle
	static void pattern5(int n) {
	    int num = 1;
	   for(int i=1;i<=n;i++){
	       for(int j=1;j<=i;j++){
	            System.out.print(num+" ");
	            num++;
	       }
	       System.out.println();
	   }
    }
	
	// 0 and 1 triangle
	static void pattern6(int n) {
		   for(int i=1;i<=n;i++){
		       for(int j=1;j<=i;j++){
		           if((i+j)%2==0){
		               System.out.print("1 ");
		           }else{
		               System.out.print("0 ");
		           }
		       }
		       System.out.println();
		   }
	}
}
