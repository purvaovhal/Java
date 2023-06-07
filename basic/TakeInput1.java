package basic;

import java.util.Scanner;

public class TakeInput1 {
	public static void main(String[] args) {
	System.out.println("Enter your input..");
    Scanner input = new Scanner(System.in); //<--here 'input' is a variable, 
                                                // it will read everything that you want.
    //System.out.println(input.nextInt());
//   int a = input.nextInt();
//   System.out.println(a);
   
//   System.out.println(input.next());          //ABC
//   System.out.println(input.nextLine());      //ABC XYZ
   
   String name = input.nextLine(); 
   System.out.println(name);
}
}
