package functions_methods;

public class ArgsDemo {
	public static void main(String[] arg) {
		
		System.out.println("Sum is : "+sum(15, 30));
		
//		int ans = sum(15, 30);
//		System.out.println("Sum is : "ans);
	}
	static int sum(int a, int b) {
		int sum = a + b;
		return sum; 
	}
}
