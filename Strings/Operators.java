package Strings;

import java.util.ArrayList;

public class Operators {

	public static void main(String[] args) {
		System.out.println('X'+'y');
		System.out.println("x"+"y");
		
		System.out.println(('a'+ 2));   
		System.out.println((char)('a'+ 2));
		
		System.out.println("x"+ 1);
		
    	System.out.println("abcd" + new ArrayList<>()); 
    	
    	System.out.println("abcd"+ new Integer(122));
    	
    	System.out.println(new Integer(122)+""+ new ArrayList<>());
		
	}

}
