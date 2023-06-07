package ConditionsLoops;

import java.util.Scanner;

public class UpperLowerCase {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter");
		char ch = ab.next().trim().charAt(0); //--trim() is used to trim 
	                           	//anything(space,letter) before any string
		if(ch>='a' && ch<='z') {
			System.out.println(ch+" is lowercase");
		}else {
			System.out.println(ch+" is uppercase");
		}
	}

}
