package functions_methods;

public class Practice1 {
	public static void main(String[] args) {
		String naam = "ghj";
		changename(naam);
		System.out.print(naam);  //--name will not change
	}
	static void changename(String name) {
		name = "abc";
	}

}
