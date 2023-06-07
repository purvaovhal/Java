package patterns;

import java.util.Scanner;

public class Rhombus {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		for(int i=1;i<=n;i++){
		    int s=n-i;
		    for(int j=1;j<=s;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=n;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}

}
