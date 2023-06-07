package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		 ArrayList<Integer> list = new ArrayList<>(5);
		 for(int i = 0;i<=n;i++) {
			 list.add(ab.nextInt());		
		 }
		 System.out.println("Output");
		 for(int i = 0;i<=n;i++) {
			 System.out.print(list.get(i)+" ");		
		 }
		 // list format
		 System.out.println(list);  // [1, 2, 3, 4, 5]
		 
	}

}
