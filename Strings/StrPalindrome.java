package Strings;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = ab.nextLine();

		System.out.println(IsPalindrome(st));

	}
	
	static boolean IsPalindrome(String str) {
		if(str.length()==0 || str==null) {
			return false;
		}
		str = str.toLowerCase();
		for(int i=0;i<=str.length()/2 ; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i); 
			
			if(start != end) {
				return false;
			}
		}
		return true;
	}

}
