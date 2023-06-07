package arrays;
import java.util.*;
public class SwapFun {
    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);
         int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = ab.nextInt(); 
        }

        System.out.println(Arrays.toString(arr));

        swap(arr, 2, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
    
}
