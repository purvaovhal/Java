package patterns;

import java.util.Scanner;

public class Pattern1 {
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
		pattern28(n);
	}
	
	static void pattern1(int n) {
		for (int row=1;row<=n;row++) {
			// for every row run the col
			for(int col=1;col<=n;col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i=1;i<=n;i++) {          // or (i=0;i<n;i++)
			for(int j=1 ;j<=n-i+1;j++) {  // or (j=0;j<n-i;j++)
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
/* OR	static void pattern3(int n) {
			for (int i=n;i>=1;i--) {
				for(int j=1 ;j<=i;j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		}   
*/
	
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" "); // Printing col numbers, therefore use j
			}                            // for row number, use i 
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int row=0;row < 2*n;row++) {
			int totalColsInRow = row > n ? 2*n-row: row;
			for(int col=0; col < totalColsInRow ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern28(int n) {
		for(int row=0;row < 2*n;row++) {
			int totalColsInRow = row > n ? 2*n-row: row;
			
			int noOfSpaces = n - totalColsInRow;
			for(int s=0;s<noOfSpaces;s++) {
				System.out.print(" ");
			}
			for(int col=0; col < totalColsInRow ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

}
