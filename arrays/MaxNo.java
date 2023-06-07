package arrays;
import java.util.Scanner;
public class MaxNo {
    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ab.nextInt();
        }
    
       System.out.println("Max no.: "+max(arr));

        System.out.println("Max in Range: "+maxRange(arr, 1, 4));

    }

    static int max(int[] num){
        if(num.length==0){
            return -1;
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        return max;
    }


    static int maxRange(int[] num, int start, int end){
        // if(end>start){
        //     return -1;
        // }

        if(num==null){
            return -1;
        }
        int max = num[start];
        for (int i = start; i <= end; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        return max;
    }
    
}
