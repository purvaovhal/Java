package arraylist;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		 
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(15);
//		list.add(25);
//		list.add(30);
//		list.add(35);
//
//		System.out.println(list);
		
		ArrayList<Integer> a = new ArrayList<>(3);
		a.add(15);
		a.add(32);
		a.add(25);
		a.add(50);
		a.add(75);
		a.add(32);
		a.add(38);
		a.add(98);
		
		System.out.println(a.contains(32));
		System.out.println(a.contains(322));
		System.out.println(a);
		
		a.set(2, 33);
		a.set(4, null);
		a.remove(6);
		System.out.println(a);

	}

}
