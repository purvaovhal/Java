package functions_methods;

public class Scope {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String name = "ABCJH";
		
		{
//			int a = 25; --already initialized outside the block in the same method, hence cannot initialized it again. 
			a = 25; //-- can change value.
			 int c = 99;
			 name = "XYZGH";
			 System.out.println(name);
			 System.out.println(a);
			 // values initialized in this block, will remain in block.
		}
		System.out.println(name);
		 //System.out.println(a);// cannot used outside the block.
	}
	static void random(int marks) {
		int num = 50;
		System.out.println(num);
		System.out.println(marks);
	}
}
