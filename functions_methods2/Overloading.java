package functions_methods2;

public class Overloading {
	public static void main (String[] args) {
		fun(15);
		fun(63, 65);
		fun("Purva");
	}
	
	static void fun(int a) {
		System.out.println("First:");
		System.out.println(a);
	}
	
	static void fun(int b, int a) {
		System.out.println("Second:");
		System.out.println(b+" "+a);
	}

	static void fun(String name) {
		System.out.println("Third:");
		System.out.println(name);
	}
}
