package Strings;

import java.util.Arrays;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name = "ABC XYZ";
		String name2 = "ABC XYZ";
		System.out.println(name==name2);  // true
		
		System.out.println(name.equals(name2));  // true
		
		String name10 = new String("abc");
		String name11 = new String("abc");
        System.out.println(name10==name11);   // false
        
        // checks the value.
        System.out.println(name10.equals(name11));   // true
        
        System.out.println(name10.charAt(1));   // b
        
        System.out.println(new int[] {2,3,4,5});  // [I@24d46ca6  (using default method)
        System.out.println(Arrays.toString(new int[] {2,3,4,5}));   // [2, 3, 4, 5]

	}

}
 