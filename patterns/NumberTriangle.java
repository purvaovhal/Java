package patterns;

import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		for(int i=1;i<=n;i++){
		    int s = n-i;
		    for(int r=1;r<=s;r++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(i+" ");
		    }
		    System.out.println();
	}
}

}
