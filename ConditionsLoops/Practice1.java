package ConditionsLoops;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the operation you want:");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        int a = ab.nextInt();
        switch(a) {
        case 1:{
          System.out.println("Enter two no.");
          int n1 = ab.nextInt();
          int n2 = ab.nextInt();
          int result = n1 + n2;
          System.out.println(result);
          break;
        }
        case 2:{
            System.out.println("Enter two no.");
            int n1 = ab.nextInt();
            int n2 = ab.nextInt();
            int result = n1 - n2;
            System.out.println(result);
            break;
        }
        case 3:{ 
            System.out.println("Enter two no.");
            int n1 = ab.nextInt();
            int n2 = ab.nextInt();
            int result = n1 * n2;
            System.out.println(result);
            break;
        }
        case 4:{
            System.out.println("Enter two no.");
            int n1 = ab.nextInt();
            int n2 = ab.nextInt();
            int result = n1 / n2;
            System.out.println(result);
            break;
          }
          
        }  
	}

}
