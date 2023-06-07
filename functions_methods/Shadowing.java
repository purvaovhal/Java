package functions_methods;

public class Shadowing {
	static int x = 90;   // this will be shadowed at line 8
	public static void main(String[] arg) {
		System.out.println(x);   // 90
		int x = 40;  // the class variable at line 4 is shadowed by this.
		System.out.println(x);   // 40
		
		/*int x ;
		System.out.println(x);    <--error = scope will begin when value is initialized. 
		x = 40;   */
		
		
		fun();
	}
	static void fun() {
		System.out.println(x);
	}
}
