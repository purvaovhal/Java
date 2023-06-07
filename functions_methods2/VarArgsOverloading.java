package functions_methods2;

import java.util.Arrays;

public class VarArgsOverloading {
	public static void main(String[] args) {
		demo(15, 32, 45);
		demo("Purva","Shraddha");
		
		//demo();   error <--It can not be empty, method is ambiguous.
	}
	static void demo(int...v) {
		System.out.println(Arrays.toString(v));
	}
	
	static void demo(String...v) {
		System.out.println(Arrays.toString(v));
	}

}
