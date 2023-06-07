package functions_methods;

import java.util.Scanner;
public class SumNNumber
{
	public static void main(String[] args) {
	 Scanner ab=new Scanner(System.in);
	    int n=ab.nextInt();
	   SumNNumber(n);
	}
	
	static void SumNNumber(int n){
	    int sum=0;
	    for(int i=1;i<=n;i++){
	        sum=sum+i;
	    }
	    System.out.println("Sum is: "+sum);
	}
}
