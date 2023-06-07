package ConditionsLoops;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String... args){
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
	    while(n>0)
	    {
	    int rem= n%10;
	    System.out.print(rem);
	    n=n/10;
    }
  }
}

