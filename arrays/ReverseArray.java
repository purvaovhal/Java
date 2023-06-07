package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args)
    {
       Scanner ab = new Scanner(System.in);
       int[] num = new int[6];
       for (int i = 0; i < num.length; i++) {
        num[i] = ab.nextInt();
       }

       System.out.println(Arrays.toString(num));

       Reverse(num);

       System.out.println(Arrays.toString(num));
    }

    static void Reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
    
}
