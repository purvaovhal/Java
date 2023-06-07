package functions_methods2;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
//		System.out.println("enter int number:");
//		int n = ab.nextInt(); // can take only one number input
//		fun(n);
		
		//fun(5,8,69,65,32,49,78,26,125);
		
//		fun(); empty array
		
		multiple(23, 45, "ABCD", "hdcf");
	}
	
	static void multiple(int a, int b, String...v) {    //VarLengthArgs shuold always at the end
		System.out.println(Arrays.toString(v));
	}
	
	static void fun(int...a) {
		System.out.println(Arrays.toString(a));
	}
	

}
